import java.util.Scanner;

public class speller {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter world to spellcheck: ");
    String input = scanner.nextLine();
    scanner.close();

    String word = input.toLowerCase();
    System.out.println(word);
  }
}
