package com.digital.fund.chitty.service;

import com.digital.fund.chitty.dto.MemberDto;
import com.digital.fund.chitty.dto.UserDto;
import com.digital.fund.chitty.entity.Member;
import com.digital.fund.chitty.entity.User;
import com.digital.fund.chitty.mapper.MemberMapper;
import com.digital.fund.chitty.mapper.UserMapper;
import com.digital.fund.chitty.repository.MemberRepository;
import com.digital.fund.chitty.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService extends GenericService<MemberDto, Member, Long, MemberRepository, MemberMapper> {
    protected MemberService(final MemberRepository repository, final MemberMapper memberMapper) {
        super(repository, memberMapper);
    }
}