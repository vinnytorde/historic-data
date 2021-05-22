package com.stonks.historicdata.bar;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BarRepository extends CrudRepository<Bar, Long> {
    List<Bar> findBySymbol(@Param("symbol") String symbol);
}
