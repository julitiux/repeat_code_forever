package com.repeat_code_forever;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

public class LazyEvaluatorTest {

  @Test
  void testLazy() {

    Supplier<Boolean> first = this::firstMethod;
    Supplier<Boolean> second = this::secondMethod;

    if (first.get() || second.get())
      System.out.println(" print message !!! ");

  }

  private Boolean firstMethod() {
    return false;
  }

  private Boolean secondMethod() {
    return true;
  }
}
