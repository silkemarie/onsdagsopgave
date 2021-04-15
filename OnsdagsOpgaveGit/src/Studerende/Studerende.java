package Studerende;

import java.util.ArrayList;
import java.util.Arrays;

public class Studerende {
  private String name;
  private int[] karakterer;

  public Studerende(String name, int[] karakterer) {
    this.name = name;
    this.karakterer = karakterer;
  }

  @Override
  public String toString() {
    return "Studerende{" +
        "name='" + name + '\'' +
        ", karakterer=" + Arrays.toString(karakterer) +
        '}';
  }
}
