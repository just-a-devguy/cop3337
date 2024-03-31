// Adler G Luders
// COP 3337
// 31 Mar 2024
// Assignment 8

public class Handshakes {
  static int totalHandshakes(int n) {
    // base cases
    if (n <= 1) {
      return 0;
    }
    if (n == 2) {
      return 1;
    }

    return n - 1 + totalHandshakes(n - 1);
  }

  public static void main(String[] args) {
    int total = totalHandshakes(5);

    System.out.println(total);
  }
}