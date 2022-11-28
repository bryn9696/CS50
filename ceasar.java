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
    int key = 13;

    for (int i = 0; i < stringToChar.length; i++) {
      Boolean letter = Character.isLetter(input.charAt(i));
      if (letter) 
        // check midpoint of ASCII alphabet
        if ( stringToChar[i] >= 77 && stringToChar[i] <= 90 || stringToChar[i] >= 109 )
          stringToChar[i] -= (26 - key);
        else
          stringToChar[i] += key;
    }
    System.out.println(stringToChar);
  }
}

