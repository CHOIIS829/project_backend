package com.example.backend.repository;

import com.example.backend.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {


    boolean existsByMemberId(String id);

    Member finByMemberIdAndMemberPwd(String id, String pwd);
}
