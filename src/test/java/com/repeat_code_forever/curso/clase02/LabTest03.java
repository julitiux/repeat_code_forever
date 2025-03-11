package com.repeat_code_forever.curso.clase02;

interface Operacion2 {
  int ejecutar(int a, int b);
}

public class LabTest03 {

  public static void main(String[] args) {
    Operacion2 suma = new Operacion2() {
      @Override
      public int ejecutar(int a, int b) {
        return a + b;
      }
    };

    System.out.println(suma.ejecutar(5, 4));

  }

}
