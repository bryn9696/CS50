import java.util.Scanner;

public class mario {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter any height: ");
      int height = scanner.nextInt();
      scanner.close();
      // int height = 3;
      int x = 0;

        while (x < height) {
          x += height;
          for (int line = 0; line < height; line++)
          {
              // Loop to add spaces
              for (int spaces = height - line; spaces > 1; spaces--)
              {
                System.out.print(" ");
              }
              // Loop to add hashes
              for (int hashes = 0; hashes <= line; hashes++)
              {
                System.out.print("#");
              }
              System.out.print("  ");
              for (int hashes = 0; hashes <= line; hashes++)
              {
                System.out.print("#");
              }
              System.out.print("\n");
          }
        }
    
    
  }
}