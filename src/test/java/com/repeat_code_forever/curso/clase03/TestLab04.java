package com.repeat_code_forever.curso.clase03;

import java.util.function.Function;

public class TestLab04 {

  public static int applyOperation(int number, Function<Integer, Integer> operation) {
    return operation.apply(number);
  }

  public static void main(String[] args) {
    Function<Integer, Integer> squared = number -> number * number;
    Function<Integer, Integer> triple = number -> number * 3;

    System.out.println(applyOperation(3, squared));
    System.out.println(applyOperation(9, triple));
  }
}
