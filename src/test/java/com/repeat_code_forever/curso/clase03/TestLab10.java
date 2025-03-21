package com.repeat_code_forever.curso.clase03;

import java.util.function.Function;

public class TestLab10 {

  public static void main(String[] args) {

    Function<Integer, Integer> doubl3 = number -> number * 2;
    Function<Integer, Integer> restFive = number -> number - 5;

    Function<Integer, Integer> operation = restFive.compose(doubl3);

    System.out.println(operation.apply(6));
  }
}
