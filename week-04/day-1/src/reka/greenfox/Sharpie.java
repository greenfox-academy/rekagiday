package reka.greenfox;

/**
 * Created by User on 2017. 04. 03..
 */
public class Sharpie {

  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    this.inkAmount = 100;
  }

  public void use() {
    inkAmount--;
  }
}

