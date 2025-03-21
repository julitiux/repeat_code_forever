package com.repeat_code_forever.curso.clase03;

import java.util.List;
import java.util.function.Function;

public class TestLab11 {

  public static void main(String[] args) {
    List<String> stringLiat = List.of("julio", "ramirez", "rodriguez");

    Function<String, String> uppercase = String::toUpperCase;
    Function<String, Integer> countCharacters = String::length;

    List<Integer> integerList = stringLiat.stream()
      .map(uppercase.andThen(countCharacters))
      .toList();

    System.out.println(integerList);
  }
}
