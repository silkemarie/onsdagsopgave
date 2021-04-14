
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> eksamensbevis = new ArrayList<>(); //ArrayListe til at have liste af eksamensbeviser i
    int[] karaktererArray = new int[7];

    System.out.println("Velkommen til Kristian og Silkes karakter-program.");
    System.out.println("Indtast den studerendes navn: "); //kan vi også få det med i ArrayListen?

    String name = scan.nextLine();

    for (int i = 1; i < karaktererArray.length; i++) {
      System.out.println("Indtast karakter nr. " + i);

      eksamensbevis.add(scan.nextInt());
    }
  }
}
