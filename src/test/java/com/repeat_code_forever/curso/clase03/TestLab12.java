package com.repeat_code_forever.curso.clase03;

import java.util.List;
import java.util.function.Predicate;

public class TestLab12 {

  public static void main(String[] args) {

    List<Integer> integerList = List.of(1, 2, 3, 44, 555, 6666, 7777, 88888, 1000000);

    Predicate<Integer> isPar = number -> number % 2 == 0;
    Predicate<Integer> mayorThanTen = number -> number > 10;

    List<Integer> integerListResult = integerList.stream()
      .filter(isPar.and(mayorThanTen))
      .toList();

    System.out.println(integerListResult);
  }
}
