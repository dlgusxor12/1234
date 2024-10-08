package inhatc.cse.hyeontaekshop.member.service;

import inhatc.cse.hyeontaekshop.member.entity.Member;
import inhatc.cse.hyeontaekshop.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {


    private final MemberRepository memberRepository;

    public Member saveMember(Member member){
        validateDupMember(member);
        Member m = memberRepository.save(member);
        return m;
    }

    private void validateDupMember(Member member) {
       Member m2 = memberRepository.findByEmail(member.getEmail())
               .orElseThrow(() -> new IllegalStateException("예외 발생"));
    }
}
