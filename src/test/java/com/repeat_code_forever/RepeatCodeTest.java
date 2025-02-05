package com.repeat_code_forever;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

public class RepeatCodeTest {

  @Test
  void repeatCode() {
    final List<BigDecimal> bigDecimals = List.of(new BigDecimal("1.0"), new BigDecimal("1.0"), new BigDecimal("1.0"));

    final BigDecimal test = bigDecimals.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

    System.out.println(test);
  }

}
