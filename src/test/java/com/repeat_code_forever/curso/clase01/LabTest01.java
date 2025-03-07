package com.repeat_code_forever.curso.clase01;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

public class LabTest01 {

  @Test
  void lab01() {
    BiFunction<Integer, Integer, Integer> suma = Integer::sum;
    System.out.println(suma.apply(10, 2));
  }
}
