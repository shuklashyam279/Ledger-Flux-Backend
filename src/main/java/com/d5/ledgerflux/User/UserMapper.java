package com.d5.ledgerflux.User;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  UserDTO toDTO(User user);

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "password", ignore = true)
  // @Mapping(target = "authorities", ignore = true)
  User toEntity(UserDTO dto);
}
