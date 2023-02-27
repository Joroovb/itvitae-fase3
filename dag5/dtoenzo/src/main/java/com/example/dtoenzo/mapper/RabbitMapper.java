package com.example.dtoenzo.mapper;

import com.example.dtoenzo.dto.RabbitDto;
import com.example.dtoenzo.models.Rabbit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RabbitMapper {
    @Mapping(source = "age", target = "leeftijd")
    RabbitDto toDto(Rabbit rabbit);
    @Mapping(source = "leeftijd", target = "age")
    Rabbit toEntity(RabbitDto rabbit);
}
