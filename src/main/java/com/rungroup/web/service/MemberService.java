package com.rungroup.web.service;

import com.rungroup.web.dto.MemberDto;

import java.util.List;

public interface MemberService {
    List<MemberDto> findAllMembers();
}
