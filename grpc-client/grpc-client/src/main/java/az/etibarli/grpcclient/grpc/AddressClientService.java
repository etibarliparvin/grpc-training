package az.etibarli.grpcclient.grpc;

import az.etibarli.models.AddressRequest;
import az.etibarli.models.AddressResponse;
import az.etibarli.models.AddressServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AddressClientService {

    private AddressServiceGrpc.AddressServiceBlockingStub stub;

    @PostConstruct
    public void init() {
        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 1991).usePlaintext().build();
        stub = AddressServiceGrpc.newBlockingStub(channel);
    }

    public AddressResponse method(Long id) {
        AddressRequest build = AddressRequest.newBuilder().setId(id).build();
        AddressResponse response = stub.getAddress(build);
        return response;
    }
}
