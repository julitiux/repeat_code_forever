package com.repeat_code_forever.curso.clase03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestLab05 {

  public static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
    return numbers.stream()
      .filter(predicate)
      .toList();
  }

  public static void main(String[] args) {
    final List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    System.out.println(filter(integerList, number -> number % 2 == 0));
    System.out.println(filter(integerList, number -> number > 5));
  }
}
