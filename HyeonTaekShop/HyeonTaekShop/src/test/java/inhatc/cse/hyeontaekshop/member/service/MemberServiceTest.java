package inhatc.cse.hyeontaekshop.member.service;

import inhatc.cse.hyeontaekshop.member.dto.MemberDto;
import inhatc.cse.hyeontaekshop.member.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@Transactional
class MemberServiceTest {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MemberService memberService;

    @Test
    @DisplayName("사용자 등록 테스트")
    void saveMember() {
        Member member = createMember();
        Member savedMember = memberService.saveMember(member);

        assertEquals("hong4@test.com", savedMember.getEmail());
    }

    private Member createMember() {
        MemberDto memberDto = MemberDto.builder()
                .address("인천 미추홀구")
                .name("홍길동")
                .email("hong4@test.com")
                .password("1111")
                .build();
        Member member = Member.createMember(memberDto, passwordEncoder);
        System.out.println(member);
        return member;
    }
}