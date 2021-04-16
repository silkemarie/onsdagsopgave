
import Studerende.Studerende;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] karaktererArray = new int[7];

    System.out.println("Velkommen til Kristian og Silkes karakter-program.");
    System.out.println("Indtast den studerendes navn: ");

    String navn = scan.nextLine();

    for (int i = 0; i < karaktererArray.length; i++) {
      System.out.println("Indtast karakter nr. " + (i+1));

      karaktererArray[i] = validerKarakter(scan.nextInt());  // Validere karakterer indne den bliver sat i array'et

    }
    Studerende studerende = new Studerende(navn, karaktererArray);
    udskrivStuderende(studerende);
  }

  public static int validerKarakter(int karakter) {
    if (karakter == -3 || karakter == 0 || karakter == 2 || karakter == 4 || karakter == 7 || karakter == 10 || karakter == 12) {
    } else {
      throw new IllegalArgumentException("Indtast venligst gyldige karakterer.");
    }
    return karakter;
  }

  public static void udskrivStuderende(Studerende studerende) {
    System.out.println(studerende);
  }
}
