import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class voter {
  
  public static void main(String[] args) {
  String[] preferencesOne = new String[5];
  String[] options = {"Bob", "Alice", "Bryn", "Ned", "Emma"};
  List<String> inputs = new ArrayList<>();
  int bob = 0;
  int alice = 0;
  int bryn = 0;
  int ned = 0;
  int emma = 0;

  for (int j = 0; j < preferencesOne.length; j++) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Name: ");
    String name = scanner.nextLine().trim(); 
    inputs.add(0, name);

    for (int i = 0; i < options.length; i++) {
      if (name.equals(options[i])) {
        preferencesOne[j] = inputs.get(0);
        System.out.println(Arrays.toString(preferencesOne));
      }
    }
  }
  
  for (int k = 0; k < inputs.size(); k++) {
    if (k == 4) {
      if (inputs.get(k).equals("Bryn")) {
        bryn += 5;
      } else if (inputs.get(k).equals("Alice")) {
        alice += 5;
      } else if (inputs.get(k).equals("Emma")) {
        emma += 5;
      } else if (inputs.get(k).equals("Ned")) {
        ned += 5;
      } else if (inputs.get(k).equals("Bob")) {
        bob += 5;
      }
    }
    if (k == 3) {
      if (inputs.get(k).equals("Bryn")) {
        bryn += 4;
      } else if (inputs.get(k).equals("Alice")) {
        alice += 4;
      } else if (inputs.get(k).equals("Emma")) {
        emma += 4;
      } else if (inputs.get(k).equals("Ned")) {
        ned += 4;
      } else if (inputs.get(k).equals("Bob")) {
        bob += 4;
      }
    }

    if (k == 2) {
      if (inputs.get(k).equals("Bryn")) {
        bryn += 3;
      } else if (inputs.get(k).equals("Alice")) {
        alice += 3;
      } else if (inputs.get(k).equals("Emma")) {
        emma += 3;
      } else if (inputs.get(k).equals("Ned")) {
        ned += 3;
      } else if (inputs.get(k).equals("Bob")) {
        bob += 3;
      }
    }

    if (k == 1) {
      if (inputs.get(k).equals("Bryn")) {
        bryn += 2;
      } else if (inputs.get(k).equals("Alice")) {
        alice += 2;
      } else if (inputs.get(k).equals("Emma")) {
        emma += 2;
      } else if (inputs.get(k).equals("Ned")) {
        ned += 2;
      } else if (inputs.get(k).equals("Bob")) {
        bob += 2;
      }
    }

    if (k == 0) {
      if (inputs.get(k).equals("Bryn")) {
        bryn += 1;
      } else if (inputs.get(k).equals("Alice")) {
        alice += 1;
      } else if (inputs.get(k).equals("Emma")) {
        emma += 1;
      } else if (inputs.get(k).equals("Ned")) {
        ned += 1;
      } else if (inputs.get(k).equals("Bob")) {
        bob += 1;
      }
    }

  }

  // if ((bob < alice) && (bob < emma) && (bob < bryn) && (bob < ned)) {
  //   int pos = inputs.indexOf("Bob");
  //   inputs.remove(pos);
  // } else if ((bob > alice) && (alice < emma) && (bob < alice) && (alice < ned)) {
  //   int pos = inputs.indexOf("Bob");
  //   inputs.remove(pos);
  // }

  System.out.println(Arrays.toString(preferencesOne));
  System.out.println("Bryn: " + bryn + " Alice: " + alice + " Emma: " + emma + " Ned: " + ned + " Bob: " + bob);

  }
}
