package Studerende;

import java.util.Arrays;

public class Studerende {
  private String navn;
  private int[] karakterer;

  public Studerende(String navn, int karakterer) {
    this.navn = navn;
    this.karakterer = new int[karakterer];
  }

  public String getNavn() throws IllegalArgumentException {
    return navn;
  }

  @Override
  public String toString() {
    return "Studerende: "
        + "Navn - " + navn
        + ", karakterer - " + Arrays.toString(karakterer);
  }

  public void tilføjKarakterer(int[] karakterer) {
    this.karakterer = karakterer;
  }
}
