package com.repeat_code_forever;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

public class LazyEvaluatorTest {

  @Test
  void testLazy() {

    Supplier<Boolean> first = this::firstMethod;
    Supplier<Boolean> second = this::secondMethod;

    System.out.println(
      "\nfirst :: " + first.get() +
      "\nsecond :: " + second.get()
    );

  }

  private Boolean firstMethod() {
    return false;
  }

  private Boolean secondMethod() {
    return true;
  }
}
