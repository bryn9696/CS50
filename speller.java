import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class speller {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter word to spellcheck: ");
    String input = scanner.nextLine();
    scanner.close();

    int spellCount = 0;
    String word = input.toLowerCase();
    String[] words = word.split(" ");
    List<String> incorrectlySpeltWords = new ArrayList<>();

    String[] dictionary = {"how", "toast", "beach", "computer", "nest"};
    Arrays.sort(dictionary);

    for (int j = 0; j < words.length; j++) {
      for (int i = 0; i < dictionary.length; i++) {
        if (!words[j].equals(dictionary[i])) {
          if (!incorrectlySpeltWords.contains(words[j])) {
            for (int k = 0; k < dictionary.length; k++) {
              if (Arrays.binarySearch(dictionary, words[j]) < 0) {
                incorrectlySpeltWords.add(0, words[j]);
              }
              break;
            }            
          }
          break;
        }
      }
    }
    
    Collections.reverse(incorrectlySpeltWords);
    System.out.println("These words " + incorrectlySpeltWords + " are spelt incorrectly");
    System.out.println("check complete");
  }
}
