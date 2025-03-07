package com.repeat_code_forever.curso.clase01;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LabTest01 {

  @Test
  void lab01() {
    BiFunction<Integer, Integer, Integer> suma = Integer::sum;
    System.out.println(suma.apply(10, 2));

    Consumer<String> imprimir = System.out::println;
    imprimir.accept("Hola Inmundo");
  }
}
