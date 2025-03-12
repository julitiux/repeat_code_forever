package com.repeat_code_forever.curso.clase03;

import java.util.function.Function;

public class TestLab01 {

  public static int operator(int number, Function<Integer, Integer> operation) {
    return operation.apply(number);
  }

  public static void main(String[] args) {

    Function<Integer, Integer> duplicate = x -> x * 2;
    Function<Integer, Integer> divide = x -> x / 2;

    System.out.println(operator(10, duplicate));
    System.out.println(operator(20, divide));
  }
}
