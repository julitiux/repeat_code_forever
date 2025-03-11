package com.repeat_code_forever.curso.clase02;

@FunctionalInterface
interface Operacion {
  int ejecutar(int a, int b);
}

public class LabTest02 {

  public static void main(String[] args) {
    Operacion multiplicacion = (x, y) -> x * y;
    System.out.println(multiplicacion.ejecutar(3, 4));
  }
}
