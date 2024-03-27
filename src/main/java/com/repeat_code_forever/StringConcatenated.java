package com.repeat_code_forever;

import java.util.function.Consumer;

public class StringConcatenated {

  static String finalString;

  private StringConcatenated() {
    finalString = "StartingWithConstructor";
  }

  public StringConcatenated firstString(String firstString) {
    finalString += firstString;
    return this;
  }

  public StringConcatenated secondString(String secondString) {
    finalString += secondString;
    return this;
  }

  public static String make(final Consumer<StringConcatenated> block) {
    final StringConcatenated stringConcatenated = new StringConcatenated();
    block.accept(stringConcatenated);
    return finalString;
  }

}
