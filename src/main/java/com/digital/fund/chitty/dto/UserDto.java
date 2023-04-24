package com.digital.fund.chitty.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDto {
    private Long userId;
    private String username;
    private String email;
    private String password;
}
