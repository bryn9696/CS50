import java.util.Scanner;

public class ceasar {
  static String userInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter special word: ");
    String input = scanner.nextLine();
    scanner.close();

    return input;
  }

  public static void main(String[] args) {
    String input = userInput();
    char[] stringToChar = input.toCharArray();

    for (int i = 0; i < stringToChar.length; i++) {
      Boolean letter = Character.isLetter(input.charAt(i));
      if (letter) 
        stringToChar[i]++;
    }
    System.out.println(stringToChar);
  }
}

