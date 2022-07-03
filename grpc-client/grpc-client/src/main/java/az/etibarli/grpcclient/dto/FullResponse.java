package az.etibarli.grpcclient.dto;

import lombok.Data;

@Data
public class FullResponse {

    private PersonResponseDto personResponseDto;
    private AddressResponseDto addressResponseDto;
}
