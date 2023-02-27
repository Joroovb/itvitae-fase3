package com.example.dtoenzo.dto.human;

import com.example.dtoenzo.dto.rabbit.RabbitDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HumanGetDto {
    private Long id;
    private List<RabbitDto> rabbits;
}
