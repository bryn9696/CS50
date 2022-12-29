import java.util.Scanner;

public class cash {
  static Double userInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter change: ");
    double change = scanner.nextDouble();
    scanner.close();
  
    return change;
  }

  public static void main(String[] args) {
    int coins = (int) (userInput() * 100);
    int count = 0;

    while (coins > 0) {
      if (coins >= 100) {
        coins -= 100;
        count += 1; }
      else if (coins >= 50) {
        coins -= 50;
        count += 1; }
      else if (coins >= 20) {
        coins -= 20;
        count += 1; }
      else if (coins >= 10) {
        coins -= 10;
        count += 1; }
      else if (coins >= 5) {
        coins -= 5;
        count += 1; }
      else if (coins >= 2) {
        coins -= 2;
        count += 1; }
      else if (coins >= 1) { 
        coins -= 1;
        count += 1; }
    }

    System.out.println(count);
  }
}
