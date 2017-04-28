import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input according to the problem
 * statement. --- Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems
 * not follow your orders.
 **/
class Player {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int lightX = in.nextInt(); // the X position of the light of power
    int lightY = in.nextInt(); // the Y position of the light of power
    int initialTX = in.nextInt(); // Thor's starting X position
    int initialTY = in.nextInt(); // Thor's starting Y position

    // game loop
    while (true) {
      int remainingTurns = in.nextInt();

      if (initialTX < lightX) {
        if ((initialTX - lightX) == (initialTY - lightY)) {
          System.out.println("SE");
        } else if ((initialTX - lightX) == (lightY - initialTY)) {
          System.out.println("NE");
        } else {
          System.out.println("E");
        }
      }

      if (initialTX > lightX) {
        System.out.println("W");
      } else {
        if (initialTY < lightY) {
          System.out.println("S");
        } else if (initialTY > lightY) {
          System.out.println("N");
        }
      }
    }
  }
}