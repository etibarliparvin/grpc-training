package com.example.moneywithdrawalserver.grpc;

import az.etibarli.models.PersonRequest;
import az.etibarli.models.PersonResponse;
import az.etibarli.models.PersonServiceGrpc;
import az.etibarli.models.StreamRequest;
import com.example.moneywithdrawalserver.repository.PersonRepository;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import nu.studer.sample.tables.records.PersonRecord;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;

@Service
@GrpcService
@RequiredArgsConstructor
public class PersonServerService extends PersonServiceGrpc.PersonServiceImplBase {

    private final PersonRepository repository;

    @Override
    public void getPersons(PersonRequest request, StreamObserver<PersonResponse> responseObserver) {
        if (request.getId() < 1) {
            Status status = Status.FAILED_PRECONDITION.withDescription("Id is not valid " + request.getId());
            responseObserver.onError(status.asRuntimeException());
            return;
        }

        for (long i = 1; i <= request.getId(); i++) {
            PersonRecord record = repository.findById(i);
            PersonResponse response = PersonResponse.newBuilder()
                    .setId(record.getId())
                    .setName(record.getName())
                    .setSurname(record.getSurname())
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }
}
