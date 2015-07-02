package de.ad.kata.bruteforce;

import org.junit.Test;

public class BruteForcerTest {
  @Test
  public void testAlphaNumericBruteForcer() throws Exception {
    BruteForcer bruteForcer = BruteForcer.createAlphaNumericBruteForcer();

    long then = System.currentTimeMillis();

    int combinationCount = 0;
    String actual = null;
    while (!"Andre".equals(actual)) {
      actual = bruteForcer.computeNextCombination();
      combinationCount++;
    }

    long now = System.currentTimeMillis();

    System.out.println(String.format("Found '%s'. Tried %d combination(s). Took %ss", actual, combinationCount,
        (now - then) / 1000));
  }
}
