package com.digital.fund.chitty.mapper;

import com.digital.fund.chitty.dto.UserDto;
import com.digital.fund.chitty.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends IMapper<UserDto, User> {

    UserDto convertEntityToDto(User entity);
    User convertDtoToEntity(UserDto dto);
}
