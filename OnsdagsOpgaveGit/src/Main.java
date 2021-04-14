import java.util.ArrayList;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    System.out.println("Hello there");
    modtagKarakterer(new int[]{});

  }

  public static int[] modtagKarakterer(int[] karakterer) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Indtast den studerendes karakterer: ");

    int[] karaktererArray = new int[7];
    int karakter;

    for (int i = 1; i < karaktererArray.length+1; i++) {
      System.out.println("Indtast karakter nr. " + i );
      int karakter1 = scan.nextInt();
      scan.nextLine(); //scanner"bug"

     // if (karakter != -3 || 00 || 2 || 4 || 7 || 10 || 12) {

    }

    return karakterer;
  }
}
