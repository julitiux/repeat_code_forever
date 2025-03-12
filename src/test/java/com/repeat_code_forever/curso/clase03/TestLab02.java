package com.repeat_code_forever.curso.clase03;

import java.util.function.Function;

public class TestLab02 {

  public static Function<Integer, Integer> implementMultiplayer(int factor) {
    return x -> x * factor;
  }

  public static void main(String[] args) {

    Function<Integer, Integer> byThree = implementMultiplayer(3);

    System.out.println(byThree.apply(4));
  }
}
