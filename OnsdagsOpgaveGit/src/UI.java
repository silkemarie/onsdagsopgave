import Studerende.Studerende;

import java.util.Scanner;

public class UI {
  public static int[] givKarakterer() {
    Scanner scan = new Scanner(System.in);

    int[] karaktererArray = new int[7];

    System.out.println("Velkommen til Kristian og Silkes karakter-program.");
    System.out.print("Indtast den studerendes navn: ");

    String navn = scan.nextLine();

    for (int i = 0; i < karaktererArray.length; i++) {
      System.out.println("Indtast karakter nr. " + (i+1));

      karaktererArray[i] = validerKarakter(scan.nextInt());  // Validerer karakterer inden den bliver sat i array'et
    }
    return karaktererArray;
  }

  public static int validerKarakter(int karakter) {
    int rigtigKarakter = karakter;

    if (karakter == -3 || karakter == 0 || karakter == 2 || karakter == 4 || karakter == 7 || karakter == 10 || karakter == 12) {
    } else {
      Scanner scan = new Scanner(System.in);
      System.out.println("Indtast venligst gyldige karakterer.");
      int nyKarakter = scan.nextInt();
      rigtigKarakter = validerKarakter(nyKarakter); //sørger for at fjerne ugyldig karakter
    }
    return rigtigKarakter;
  }


  public static void udskrivStuderende(Studerende studerende) {
    System.out.println(studerende);
  }
}

