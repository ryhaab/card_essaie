package com.example.cardservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/card-data")
public class CardDataController {

    @Autowired
    private CardDataService cardDataService;

    @PostMapping("/parse")
    public List<CardData> parseCardData(@RequestBody Map<String, String> request) {
        String trame = request.get("trame");
        return cardDataService.parseAndInsertData(trame);
    }
}
