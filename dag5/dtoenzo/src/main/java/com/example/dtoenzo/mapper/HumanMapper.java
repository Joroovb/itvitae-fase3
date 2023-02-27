package com.example.dtoenzo.mapper;

import com.example.dtoenzo.dto.human.HumanDto;
import com.example.dtoenzo.dto.human.HumanGetDto;
import com.example.dtoenzo.models.Human;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HumanMapper {
    HumanGetDto toDto(Human human);
    Human toEntity(HumanDto human);
}
