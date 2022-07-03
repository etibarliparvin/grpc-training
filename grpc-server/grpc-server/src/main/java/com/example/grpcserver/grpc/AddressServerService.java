package com.example.grpcserver.grpc;

import az.etibarli.models.AddressRequest;
import az.etibarli.models.AddressResponse;
import az.etibarli.models.AddressServiceGrpc;
import com.example.grpcserver.repository.AddressRepository;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import nu.studer.sample.tables.records.AddressRecord;
import org.springframework.stereotype.Service;

@Service
@GrpcService
@RequiredArgsConstructor
public class AddressServerService extends AddressServiceGrpc.AddressServiceImplBase {

    private final AddressRepository repository;

    @Override
    public void getAddress(AddressRequest request, StreamObserver<AddressResponse> responseObserver) {
        AddressRecord record = repository.findById(request.getId());

        AddressResponse response = AddressResponse.newBuilder()
                .setId(record.getId())
                .setCountry(record.getCountry())
                .setCity(record.getCity())
                .setLocation(record.getLocation())
                .setPersonId(record.getPersonId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
