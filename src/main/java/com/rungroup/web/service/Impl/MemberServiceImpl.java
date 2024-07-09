package com.rungroup.web.service.Impl;

import com.rungroup.web.dto.MemberDto;
import com.rungroup.web.repository.MemberRepository;
import com.rungroup.web.service.MemberService;

import java.util.List;

public class MemberServiceImpl implements MemberService {

    public MemberServiceImpl(MemberRepository memberRepository) {
    }

    @Override
    public List<MemberDto> findAllMembers() {
        return null;
    }
}
