package inhatc.cse.hyeontaekshop.index.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IndexDto {
    private String name;
    private int grade;
    private String dept;


    public String getName() {
        return name;
    }
}
