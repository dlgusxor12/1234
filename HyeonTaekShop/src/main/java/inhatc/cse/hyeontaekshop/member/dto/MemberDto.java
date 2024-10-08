package inhatc.cse.hyeontaekshop.member.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDto {
    private String name;
    private String email;
    private String password;
    private String address;
}
