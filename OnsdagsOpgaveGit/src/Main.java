
import Studerende.Studerende;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] karaktererArray = new int[7];

    System.out.println("Velkommen til Kristian og Silkes karakter-program.");
    System.out.println("Indtast den studerendes navn: "); //kan vi også få det med i ArrayListen?

    String name = scan.nextLine();

    for (int i = 1; i < karaktererArray.length+1; i++) {
      System.out.println("Indtast karakter nr. " + i);

      karaktererArray[i] = scan.nextInt();

    }
    Studerende studerende = new Studerende(name, karaktererArray);
    System.out.println(studerende);
  }
}
