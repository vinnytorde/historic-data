package com.stonks.historicdata.bar;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(
    uniqueConstraints =
        @UniqueConstraint(
            columnNames = {"symbol", "time"},
            name = "DateSymbolNotUnique"))
@Data
@NoArgsConstructor
public class Bar {

  @Id @GeneratedValue private Long barId;
  @NotNull private String symbol;
  @NotNull private OffsetDateTime time;
  @NotNull private BigDecimal open;
  @NotNull private BigDecimal close;
  @NotNull private BigDecimal high;
  @NotNull private BigDecimal low;
  @NotNull private Long volume;
}
