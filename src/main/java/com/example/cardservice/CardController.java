package com.example.cardservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping("/card")
    public List<Object[]> getCardData(@RequestParam String cardCode) {
        return cardService.getCardData(cardCode);
    }
}
