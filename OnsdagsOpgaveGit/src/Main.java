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

    for (int i = 1; i < karakterer.length+1; i++) {
      System.out.println("Indtast karakter nr. " + i );
      int karakter1 = scan.nextInt();
      scan.nextLine(); //scanner"bug"
      int karakter2 = scan.nextInt();

      //if (! equals 3, 4,4, )

    }

    return karakterer;
  }
}
