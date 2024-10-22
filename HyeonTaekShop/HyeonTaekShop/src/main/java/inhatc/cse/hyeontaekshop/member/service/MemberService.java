package inhatc.cse.hyeontaekshop.member.service;

import inhatc.cse.hyeontaekshop.member.entity.Member;
import inhatc.cse.hyeontaekshop.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {


    private final MemberRepository memberRepository;

    public Member saveMember(Member member){
        validateDupMember(member);
        Member m = memberRepository.save(member);
        return m;
    }

    private void validateDupMember(Member member) {

        Optional<Member> optMember = memberRepository.findByEmail(member.getEmail());
        if(optMember.isPresent()){
            Member member1 = optMember.get();
            throw new IllegalStateException("이미 존재하는 사용자 입니다.");
        }
    }
}
