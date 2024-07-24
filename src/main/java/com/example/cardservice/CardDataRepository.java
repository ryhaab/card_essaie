package com.example.cardservice;



import com.example.cardservice.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface CardDataRepository extends JpaRepository<CardData, String> {

    @Query(value = "SELECT * FROM parsee_and_insert_data(:input)", nativeQuery = true)
    List<Object[]> callStoredProcedure(@Param("input") String input);
}
