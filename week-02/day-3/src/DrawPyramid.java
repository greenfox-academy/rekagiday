import java.util.Scanner;

/**
 * Created by User on 2017. 03. 22.
 */
public class DrawPyramid {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a number to indicate how big your pyramid should be");
    int lines = scanner.nextInt();

    for (int i = 0; i < lines; i++) {
      for (int k = i; k < lines; k++) {
        if (k != lines - 1) {
          System.out.print(" ");
        }
      }
      for (int j = 0; j <= i * 2; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

