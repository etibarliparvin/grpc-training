package com.example.moneywithdrawalclient.grpc;

import az.etibarli.models.PersonRequest;
import az.etibarli.models.PersonResponse;
import az.etibarli.models.PersonServiceGrpc;
import com.example.moneywithdrawalclient.dto.PersonDto;
import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PersonClientService {

    private PersonServiceGrpc.PersonServiceBlockingStub stub;

    @PostConstruct
    public void init() {
        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 1991).usePlaintext().build();
        stub = PersonServiceGrpc.newBlockingStub(channel);
    }

    public List<PersonDto> method(Long id) {
        PersonRequest build = PersonRequest.newBuilder().setId(id).build();
        Iterator<PersonResponse> persons = stub.getPersons(build);
        List<PersonDto> list = new ArrayList<>();
        while (persons.hasNext()) {
            PersonDto personDto = new PersonDto();
            PersonResponse personResponse = persons.next();
            personDto.setId(personResponse.getId());
            personDto.setName(personResponse.getName());
            personDto.setSurname(personResponse.getSurname());
            list.add(personDto);
        }
        return list;
    }

    public PersonDto method2(Long id) {
        return null;
    }
}
