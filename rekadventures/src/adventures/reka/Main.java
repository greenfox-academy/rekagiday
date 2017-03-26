package adventures.reka;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter your name");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name
        + "! This is where you start. (*). Try to find the treasure chest (#). Avoid the traps (@) and fight monsters (M)!");

    int userPosX = 0;
    int userPosY = 0;
    int[] trapPosX = {3, 2, 4, 8};
    int[] trapPosY = {1, 5, 7, 2};

    while (true) {

      int fieldSize = 10;
      char[][] field = new char[fieldSize][fieldSize];

      for (int y = 0; y < fieldSize; y++) {
        for (int x = 0; x < fieldSize; x++) {
          if (y == userPosY && x == userPosX) {
            field[y][x] = '*';
          } else {
            for (int trapIndex = 0; trapIndex < trapPosX.length; trapIndex++) {
              if (y == trapPosY[trapIndex] && x == trapPosX[trapIndex]) {
                field[y][x] = '@';
              } else if (field[y][x] != '@' && field[y][x] != '*' ) {
                field[y][x] = '_';
              }
            }
          }
        }
      }
      for (int y = 0; y < fieldSize; y++) {
        for (int x = 0; x < fieldSize; x++) {
          System.out.print(field[y][x] + " ");
        }
        System.out.println();
      }

      System.out.println("Please let me know which way you want to go! "
          + "North, east, south or west? (Type n, e, s or w). Type exit to exit. ");
      String move = scanner.nextLine();

      if (move.equals("exit")) {
        break;
      } else if (move.equals("w")) {
        System.out.println("You moved 1 step to west.");
        userPosX--;
      } else if (move.equals("e")) {
        System.out.println("You moved 1 step to east.");
        userPosX++;
      } else if (move.equals("n")) {
        userPosY--;
        System.out.println("You moved 1 step to north.");
      } else if (move.equals("s")) {
        userPosY++;
        System.out.println("You moved 1 step to south.");
      } else {
        System.out.println("Wrong direction. Please move or die. ");
      }
    }
  }
}

