/**
 * Created by User on 2017. 03. 23..
 */

import java.util.*;

public class ElementFinder {

  public static void main(String... args) {
    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

    if (arrayList.contains(7)) {
      System.out.println("Hooray!");
    } else {
      System.out.println("Nooooo!");
    }
  }
}
