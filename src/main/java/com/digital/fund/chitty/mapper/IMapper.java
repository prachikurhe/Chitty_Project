package com.digital.fund.chitty.mapper;

import com.digital.fund.chitty.dto.UserDto;
import com.digital.fund.chitty.entity.User;

public interface IMapper<D, E> {

    D convertEntityToDto(E entity);
    E convertDtoToEntity(D dto);
}
