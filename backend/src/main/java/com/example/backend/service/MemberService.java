package com.example.backend.service;

import com.example.backend.domain.dto.LoginRequestDto;
import com.example.backend.domain.entity.Member;
import com.example.backend.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member signUp(Member m){
        return memberRepository.save(m);
    }

    public boolean existMember(LoginRequestDto loginRequestDto) {
        return memberRepository.existsByMemberId(loginRequestDto.getId());
    }

    /*
    * 로그인 구현
    * Entity getter 없어서 pwd repository 확인
    * JWT, Spring Security, UserStore, PasswordEncoder 사용시 수정 필요.
    * */
    public Member login(LoginRequestDto loginRequestDto) {
        if (existMember(loginRequestDto)) {
            return memberRepository.finByMemberIdAndMemberPwd(loginRequestDto.getId(), loginRequestDto.getPwd());
        } else {
            return null;
        }
    }
}
