package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumTest {

  ArrayList<Integer> list;
  Number summedList;

  @BeforeEach
  void initTest() {
    list = new ArrayList<>();
    summedList = new Number();
  }

  @Test
  void testNumbers() {
    assertEquals(23, (summedList.sum(list)));
  }
}