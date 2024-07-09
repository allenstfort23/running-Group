package com.rungroup.web.repository;

import com.rungroup.web.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    @Override
    Optional<Member> findById(Long aLong);
}
