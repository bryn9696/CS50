import java.util.Scanner;

public class ceasar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter special word: ");
    String input = scanner.nextLine();
    scanner.close();

    char[] stringToChar = input.toCharArray();

    for (int i = 0; i < stringToChar.length; i++) {
      Boolean letter = Character.isLetter(input.charAt(i));
      if (letter) 
        stringToChar[i]++;
    }
    System.out.println(stringToChar);

  }
}
