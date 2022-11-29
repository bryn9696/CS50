import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
    List<String> incorrectlySpeltWords = new ArrayList<>();

    String[] dictionary = {"how", "toast", "beach", "computer", "nest"};
    Arrays.sort(dictionary);

    for (int j = 0; j < words.length; j++) {
      for (int i = 0; i < dictionary.length; i++) {
        if (!words[j].equals(dictionary[i]) && !incorrectlySpeltWords.contains(words[j])) {
              if (Arrays.binarySearch(dictionary, words[j]) < 0) {
                incorrectlySpeltWords.add(0, words[j]);
              }
              break;
        }
      }
    }
    
    Collections.reverse(incorrectlySpeltWords);
    if (incorrectlySpeltWords.size() > 1) {
      System.out.println("These words " + incorrectlySpeltWords + " are spelt incorrectly.");
    } else {
      System.out.println("This word " + incorrectlySpeltWords + " is spelt incorrectly.");
    }
    System.out.println("Check complete!");
  }
}
