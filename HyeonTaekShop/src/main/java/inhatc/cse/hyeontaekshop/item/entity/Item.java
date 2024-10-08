package inhatc.cse.hyeontaekshop.item.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @Column(nullable = false, length = 50)
    private String itemNm;

    private int price;

    @Column(name = "stock")
    private int stockNumer;

    @Lob
    @Column(nullable = false)
    private String itemDetail;

}
