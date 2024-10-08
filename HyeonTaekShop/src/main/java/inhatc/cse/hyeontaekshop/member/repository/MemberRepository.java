package inhatc.cse.hyeontaekshop.member.repository;

import inhatc.cse.hyeontaekshop.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional <Member> findByEmail(String email);
}
