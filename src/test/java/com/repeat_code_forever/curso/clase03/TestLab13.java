package com.repeat_code_forever.curso.clase03;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestLab13 {

  public static void main(String[] args) {

    BiFunction<Integer, Integer, Integer> sum = Integer::sum;
    Function<Integer, Integer> multiplyByTwo = number -> number * 2;

    BiFunction<Integer, Integer, Integer> operation = sum.andThen(multiplyByTwo);

    System.out.println(operation.apply(3, 5));
  }
}
