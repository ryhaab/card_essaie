package com.example.cardservice;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CardRepository extends CrudRepository<Card, String> {

    @Query(value = "SELECT * FROM get_card_data(:cardCode)", nativeQuery = true)
    List<Object[]> getCardData(@Param("cardCode") String cardCode);
}
