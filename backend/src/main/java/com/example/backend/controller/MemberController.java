package com.example.backend.controller;

import com.example.backend.domain.dto.LoginRequestDto;
import com.example.backend.domain.entity.Member;
import com.example.backend.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody Member m){
        try {
            Member saveMember = memberService.signUp(m);
            return new ResponseEntity<>("회원가입 성공", HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>("회원가입 실패", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<Member> logIn(@RequestBody LoginRequestDto loginRequestDto) {
        Member member = null;
        try {
            member = memberService.login(loginRequestDto);
            return new ResponseEntity<>(member, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(member, HttpStatus.BAD_REQUEST);
        }
    }
}
