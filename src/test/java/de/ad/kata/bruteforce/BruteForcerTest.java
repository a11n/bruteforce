package de.ad.kata.bruteforce;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

public class BruteForcerTest {
	
  @Test
  public void testAlphaNumericBruteForcer() throws Exception {
    
	final BruteForcer bruteForcer = BruteForcer.createAlphaNumericBruteForcer();

    final long then = System.currentTimeMillis();

    int combinationCount = 0;
    
    String actual = null;
    
    while (!"Andre".equals(actual)) {
    	
      actual = bruteForcer.computeNextCombination();
      ++combinationCount;
      
    }

    final long now = System.currentTimeMillis();
    final long timeDifferenceInSeconds = (now - then ) /1000;
    
    final String template = "Found '%s'. Tried %d combination(s). Took %ss";
    final String message = String.format(template, actual, combinationCount,timeDifferenceInSeconds);
    
    Logger.getGlobal().log(Level.INFO, message);
  }
}
