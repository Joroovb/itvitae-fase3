package com.example.dtoenzo.mapper;

import com.example.dtoenzo.dto.RabbitGetDto;
import com.example.dtoenzo.dto.RabbitPostDto;
import com.example.dtoenzo.models.Rabbit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RabbitMapper {
    RabbitGetDto toDto(Rabbit rabbit);
    Rabbit toEntity(RabbitPostDto rabbit);
}
