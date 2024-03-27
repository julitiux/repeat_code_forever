package com.repeat_code_forever;

import org.junit.jupiter.api.Test;

public class StringConcatenatedTest {


  @Test
  public void test(){
    String response = StringConcatenated.make(asl015  -> asl015
      .firstString("FirstString")
      .secondString("SecondString")
    );

    System.out.println(response);
    System.out.println(response);
    System.out.println(response);
    System.out.println(response);
  }

}
