import java.util.Scanner;

public class speller {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter word to spellcheck: ");
    String input = scanner.nextLine();
    scanner.close();

    String word = input.toLowerCase();

    String[] dictionary = {"how", "toast", "beach", "computer", "nest"};

    for (int i = 0; i < dictionary.length; i++) {
      if (word.equals(dictionary[i])) {
        System.out.println(input + " = " + dictionary[i]);
      }
    }

    System.out.println("check complete");
  }
}
