package com.repeat_code_forever.curso.clase02;

interface CalculaOperacionBasica {
  int operacion(int param1, int param2);
}

public class LabTest03 {

  public static void main(String[] args) {

    CalculaOperacionBasica suma = new CalculaOperacionBasica() {
      @Override
      public int operacion(int param1, int param2) {
        return param1 + param2;
      }
    };
    System.out.println(suma.operacion(5, 4));

    CalculaOperacionBasica resta = new CalculaOperacionBasica() {
      @Override
      public int operacion(int param1, int param2) {
        return param1 - param2;
      }
    };
    System.out.println(resta.operacion(10, 2));


    CalculaOperacionBasica multitply = new CalculaOperacionBasica() {
      @Override
      public int operacion(int param1, int param2) {
        return param1 * param2;
      }
    };
    System.out.println(multitply.operacion(9, 9));

  }
}
