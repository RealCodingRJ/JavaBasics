package Conditions;

public class Get {

  public static void main(String[] args) {
    int age = 25;
    if (age instanceof byte a && a <= 18) {
      System.out.println("Your a Child");
    }

    System.out.println("Your an Adult");
  }
}
