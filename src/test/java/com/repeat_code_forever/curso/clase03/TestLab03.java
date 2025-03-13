package com.repeat_code_forever.curso.clase03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestLab03 {

  public static void main(String[] args) {
    final var numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10);

    Function<Integer, Integer> multiplyByTwo = number -> number * 2;
    Predicate<Integer> isItEven = number -> number % 2 == 0;

    List<Integer> integerList = numbers.stream()
      .map(multiplyByTwo)
      .filter(isItEven)
      .toList();

    System.out.println(integerList);
  }

}
