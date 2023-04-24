package com.digital.fund.chitty.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Builder
@Data
public class MemberDto {
    private Long memberId;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dateOfBirth;
}
