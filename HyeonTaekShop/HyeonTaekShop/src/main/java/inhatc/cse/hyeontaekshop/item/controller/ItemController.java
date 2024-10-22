package inhatc.cse.hyeontaekshop.item.controller;

import inhatc.cse.hyeontaekshop.item.dto.ItemDataDto;
import inhatc.cse.hyeontaekshop.item.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {

    @GetMapping("/item/thymeleaf1")
    public String thymeleaf1(Model model){
        ItemDto itemDto = ItemDto.builder()
                .id(1L)
                .itemNm("상품명222")
                .itemDetail("상품 상세 설명")
                .price(10000)
                .stockNumer(100)
                .build();

        model.addAttribute("itemDto", itemDto);

        return "item/thymeleaf1";
    }

    @GetMapping("/item/thymeleaf2")
    public String thymeleaf2(ItemDataDto itemDataDto,
                             Model model){
        System.out.println("==============" + itemDataDto);
        model.addAttribute("item", itemDataDto);
        return "item/thymeleaf2";
    }
}
