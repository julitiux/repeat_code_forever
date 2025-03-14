package com.repeat_code_forever.curso.clase03;

import java.util.function.Function;

public class TestLab06 {

  public static Function<Integer, Integer> implementMultiplayer(Integer factor) {
    return x -> x * factor;
  }
  
  public static void main(String[] args) {

    final Function<Integer, Integer> functionResult = implementMultiplayer(4);

    System.out.println(functionResult.apply(5));
    System.out.println(functionResult.apply(20));
  }
}
