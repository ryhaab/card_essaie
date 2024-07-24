package com.example.cardservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;@Service
public class CardDataService {

    private final CardDataRepository cardDataRepository;

    public CardDataService(CardDataRepository cardDataRepository) {
        this.cardDataRepository = cardDataRepository;
    }

    @Transactional
    public List<CardData> parseAndInsertData(String input) {
        List<Object[]> results = cardDataRepository.callStoredProcedure(input);
        results.forEach(result -> {
            System.out.println(Arrays.toString(result));
        });
        return results.stream().map(this::mapToCardData).collect(Collectors.toList());
    }

    private CardData mapToCardData(Object[] result) {
        CardData cardData = new CardData();
        cardData.setCardNumber((String) result[0]);
        cardData.setUserName((String) result[1]);
        cardData.setClientCode((String) result[2]);
        cardData.setMatricule((String) result[3]);
        cardData.setAssignment((String) result[4]);
        cardData.setAmount((String) result[5]);
        cardData.setCeiling((String) result[6]);
        cardData.setNewCeiling((String) result[7]);
        return cardData;
    }
}
