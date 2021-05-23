package com.stonks.historicdata.bar;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BarRepository extends CrudRepository<Bar, Long> {
  List<Bar> findBySymbol(@Param("symbol") String symbol);
}
