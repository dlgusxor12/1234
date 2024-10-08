package inhatc.cse.hyeontaekshop.item.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDto {
    private Long id;
    private String itemNm;
    private int price;
    private int stockNumer;
    private String itemDetail;
}
