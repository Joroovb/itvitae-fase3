package com.example.dtoenzo.mapper;

import com.example.dtoenzo.dto.rabbit.RabbitGetDto;
import com.example.dtoenzo.dto.rabbit.RabbitPostDto;
import com.example.dtoenzo.models.Rabbit;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;


@Mapper(componentModel = "spring")
public interface RabbitMapper {
    RabbitGetDto toDto(Rabbit rabbit);
    Rabbit toEntity(RabbitPostDto rabbit);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRabbit(RabbitPostDto rabbitDto, @MappingTarget Rabbit rabbit);
}
