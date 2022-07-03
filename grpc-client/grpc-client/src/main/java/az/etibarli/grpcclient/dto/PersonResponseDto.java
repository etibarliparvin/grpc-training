package az.etibarli.grpcclient.dto;

import lombok.Data;

@Data
public class PersonResponseDto {

    private Long id;
    private String name;
    private String surname;
}
