package com.repeat_code_forever;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class RepeatCodeTest {

  @Test
  void repeatCode() {
    final List<BigDecimal> bigDecimals = Arrays.asList(
      new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
      new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
      new BigDecimal("45"), new BigDecimal("12"));

    final BigDecimal test = bigDecimals.stream()
      .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
      .map(price -> price.multiply(BigDecimal.valueOf(0.8)))
      .reduce(BigDecimal.ZERO, BigDecimal::add);

    System.out.println(test);
  }


  @Test
  void testForEachConsumer() {

    final List<String> strings = List.of("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");


    strings.forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {

      }
    });

  }

}
