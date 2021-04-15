package Studerende;

import java.util.Arrays;

public class Studerende {
  private String navn;
  private int[] karakterer;

  public Studerende(String navn, int[] karakterer) {
    this.navn = navn;
    this.karakterer = karakterer;
  }

  public String getNavn() throws IllegalArgumentException {
    return navn;
  }

  public void setNavn(String navn) {
    this.navn = navn;
  }

  @Override
  public String toString() {
    return "Studerende{" +
        "navn='" + navn + '\'' +
        ", karakterer=" + Arrays.toString(karakterer) +
        '}';
  }
}
