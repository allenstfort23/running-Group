package com.rungroup.web.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class MemberDto {
    private Long id;
    private String firstName;
    private  String lastName;
    private LocalDateTime createdOn;
}
