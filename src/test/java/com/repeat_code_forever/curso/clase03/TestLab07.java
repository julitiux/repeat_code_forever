package com.repeat_code_forever.curso.clase03;

import java.util.function.Predicate;

public class TestLab07 {

  public static Predicate<Integer> greaterThan(Integer umbral) {
    return number -> number > umbral;
  }

  public static void main(String[] args){
    final Predicate<Integer> greaterThan50 = greaterThan(50);

    System.out.println(greaterThan50.test(10));
    System.out.println(greaterThan50.test(90));
  }
}
