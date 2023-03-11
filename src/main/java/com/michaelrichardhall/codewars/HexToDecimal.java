package src.main.java.com.michaelrichardhall.codewars;

//Hex to Decimal
//Complete the function which converts hex number (given as a string) to a decimal number.

public class HexToDecimal {
      public static int hexToDec(final String hexString) {
    return Integer.valueOf(hexString, 16);
  }
}
