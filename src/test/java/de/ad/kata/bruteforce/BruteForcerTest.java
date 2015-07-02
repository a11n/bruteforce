package de.ad.kata.bruteforce;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BruteForcerTest {
  @Test
  public void testComputeNextCombination() throws Exception {
    BruteForcer bruteForcer = new BruteForcer();
    
    String actual = bruteForcer.computeNextCombination();
    String expected = "0";  
  
    assertEquals(expected, actual);
  }
}
