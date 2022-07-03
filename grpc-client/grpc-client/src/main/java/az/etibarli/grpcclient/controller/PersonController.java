package az.etibarli.grpcclient.controller;

import az.etibarli.grpcclient.dto.AddressResponseDto;
import az.etibarli.grpcclient.dto.FullResponse;
import az.etibarli.grpcclient.dto.PersonResponseDto;
import az.etibarli.grpcclient.grpc.AddressClientService;
import az.etibarli.grpcclient.repository.PersonRepository;
import az.etibarli.models.AddressResponse;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.PersonRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository repository;
    private final AddressClientService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Long id) {
        FullResponse fullResponse = new FullResponse();

        PersonResponseDto personResponseDto = new PersonResponseDto();
        AddressResponseDto addressResponseDto = new AddressResponseDto();

        PersonRecord record = repository.findById(id);
        personResponseDto.setId(record.getId());
        personResponseDto.setName(record.getName());
        personResponseDto.setSurname(record.getSurname());

        AddressResponse addressResponse = service.method(id);
        addressResponseDto.setId(addressResponse.getId());
        addressResponseDto.setCountry(addressResponse.getCountry());
        addressResponseDto.setCity(addressResponse.getCity());
        addressResponseDto.setLocation(addressResponse.getLocation());
        addressResponseDto.setPersonId(addressResponse.getPersonId());

        fullResponse.setPersonResponseDto(personResponseDto);
        fullResponse.setAddressResponseDto(addressResponseDto);

        return ResponseEntity.ok(fullResponse);
    }
}
