package com.monegoo.db;


import com.monegoo.db.entity.Currency;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
    @Query("FROM Currency c ORDER BY c.id desc limit 1")
    Currency findTopByOrderByIdDesc();
}
