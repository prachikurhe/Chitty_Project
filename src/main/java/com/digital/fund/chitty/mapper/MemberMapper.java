package com.digital.fund.chitty.mapper;

import com.digital.fund.chitty.dto.MemberDto;
import com.digital.fund.chitty.dto.UserDto;
import com.digital.fund.chitty.entity.Member;
import com.digital.fund.chitty.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface MemberMapper extends IMapper<MemberDto, Member> {
    MemberDto convertEntityToDto(Member entity);

    Member convertDtoToEntity(MemberDto dto);
}
