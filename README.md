#bruteforce

A bruteforce implementation in Java

##Motivation

I implemented this as [kata](https://en.wikipedia.org/wiki/Kata_(programming)) during my vacation. Wanted to keep my brain in shape ;-)

I was curious to find an iterative solution for an bruteforce algorithm.

##Usage

Given you have an encrypted string which you want to decrypt. And given you know the encryption algorithm, then you can decrypt the encrypted string as follows:

1. Instantiate a `BruteForcer` instance with an alphabet of your choice or with a pre-defined alphabet, such as alpha-numeric.<br/>
*Note: Bigger alphabets increase the computation time significantly. Constraint the amount of characters if you can.*
2. Define a statement which quits a loop in case a computed string matches the encrypted string.
3. Let the `BruteForcer` compute the next combination for you until the above statement is satisfied.

Please find a tiny example below:

```java
    String encryptedString = "FvG4j7LM02qqr5Sh";
    BruteForcer bruteForcer = BruteForcer.createAlphaNumericBruteForcer();

    String actual = null;
    while (!encryptedString.equals(actual)) {
      actual = encrypt(bruteForcer.computeNextCombination());
    }
    
    System.out.println(String.format("Decrypted string: %s", actual));
```

##Remark
1. I am aware that Java (maybe) isn't the best technology for this stuff in regards to speed.
2. Please DO NOT do anything stupid with that algorithm ;-)