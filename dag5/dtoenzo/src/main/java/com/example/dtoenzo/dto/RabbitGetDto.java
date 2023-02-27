package com.example.dtoenzo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RabbitGetDto {
    private Long id;
    private String name;
    private Integer age;
    private HighHatDto highHat;
}
