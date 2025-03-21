package com.repeat_code_forever.curso.clase03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestLab08 {

  public static void main(String[] args) {
    final var numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    Function<Integer, Integer> doubl3 = number -> number * 2;
    Predicate<Integer> isMayorThanTen = number -> number > 10;

    final List<Integer> result = numbers
      .stream()
      .map(doubl3)
      .filter(isMayorThanTen)
      .toList();

    System.out.println(result);
  }
}
