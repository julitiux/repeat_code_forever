package com.repeat_code_forever.curso.clase01;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LabTest01 {

  @Test
  void lab01() {
    BiFunction<Integer, Integer, Integer> suma = Integer::sum;
    System.out.println(suma.apply(10, 2));

    Consumer<String> imprimir = System.out::println;
    imprimir.accept("Hola Inmundo");

    Supplier<Double> aleatorio = () -> Math.random();
    System.out.println(aleatorio.get());
  }
}
