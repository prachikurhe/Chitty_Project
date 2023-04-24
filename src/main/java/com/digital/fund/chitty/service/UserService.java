package com.digital.fund.chitty.service;

import com.digital.fund.chitty.dto.UserDto;
import com.digital.fund.chitty.entity.User;
import com.digital.fund.chitty.mapper.UserMapper;
import com.digital.fund.chitty.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericService<UserDto, User, Long, UserRepository, UserMapper>{
    protected UserService(final UserRepository repository, final UserMapper userMapper) {
        super(repository, userMapper);
    }
}
