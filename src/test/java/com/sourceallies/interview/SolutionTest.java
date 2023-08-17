package com.sourceallies.interview;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {
  
  @Test
  void shouldPass() {
    Solution solution = new Solution();
    String name = "world";

    assertEquals("Hello " + name, solution.greeting(name));
  }

}
