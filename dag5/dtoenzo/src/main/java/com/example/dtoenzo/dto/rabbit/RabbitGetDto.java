package com.example.dtoenzo.dto.rabbit;

import com.example.dtoenzo.dto.human.HumanDto;
import com.example.dtoenzo.models.Human;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RabbitGetDto {
    private Long id;
    private String name;
    private Integer age;
    private List<HumanDto> humans;
}
