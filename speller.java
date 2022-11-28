import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class speller {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter word to spellcheck: ");
    String input = scanner.nextLine();
    scanner.close();

    String word = input.toLowerCase();
    String[] words = word.split(" ");

    System.out.println(Arrays.toString(words));
    String[] dictionary = {"how", "toast", "beach", "computer", "nest"};

    for (int i = 0; i < dictionary.length; i++) {
      for (int j = 0; j < words.length; j++) {
        if (words[j].equals(dictionary[i])) {
          System.out.println(words[j] + " = " + dictionary[i]);
        }
      }
    }

    System.out.println("check complete");
  }
}
