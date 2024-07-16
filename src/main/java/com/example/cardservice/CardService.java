package com.example.cardservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public List<Object[]> getCardData(String cardCode) {
        return cardRepository.getCardData(cardCode);
    }
}
