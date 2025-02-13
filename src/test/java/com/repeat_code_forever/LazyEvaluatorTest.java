package com.repeat_code_forever;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

public class LazyEvaluatorTest {

  @Test
  void testLazy(){

    Supplier<Boolean> first = this::firstMethod;

  }

  private Boolean firstMethod(){
    return true;
  }
}
