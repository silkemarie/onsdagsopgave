
import Studerende.Studerende;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    UI ui = new UI();
    int[] karakterer = ui.givKarakterer();

    Studerende studerende = new Studerende("Kristian", 7);
    studerende.tilføjKarakterer(karakterer);
    ui.udskrivStuderende(studerende);
  }
}
