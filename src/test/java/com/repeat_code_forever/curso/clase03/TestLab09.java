package com.repeat_code_forever.curso.clase03;

import java.util.function.Function;

public class TestLab09 {

  public static void main(String[] args) {

    Function<Integer, String> convertAsString = "Number: %d"::formatted;
    Function<String, Integer> calculateSize = String::length;

    Function<Integer, Integer> operation = convertAsString.andThen(calculateSize);
    
    System.out.println(operation.apply(1000000));
  }
}
