package com.repeat_code_forever.curso.clase02;

import java.util.Arrays;
import java.util.List;

public class LabTest04 {

  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    int suma = numeros.stream()
      .reduce(0, (num1, num2) -> num1 + num2);

    System.out.println(suma);
  }
}
