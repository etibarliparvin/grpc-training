package az.etibarli.grpcclient.dto;

import lombok.Data;

@Data
public class AddressResponseDto {

    private Long id;
    private String country;
    private String city;
    private String location;
    private Long personId;
}
