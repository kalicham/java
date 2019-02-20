public class Main {
  public static void main(String[] args) {
    final double KILOGRAMS_PER_POUND = 2.2;

    System.out.println("Kilograms     Pounds");
    for (int i = 1; i < 200; i += 2) {
      System.out.printf("%-9d     %6.1f\n", i, KILOGRAMS_PER_POUND * i);
    }
  }
}