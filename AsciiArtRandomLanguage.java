import java.util.Scanner;
import java.util.Random;
class AsciiArtRandomLanguage {
  static final int MYRANGE=127;

  public static void main(String[] args) {
    /*
     * FORMÅL: 
     * At formatere output og være kreativ II
     * (det bliver nemmere når vi får lov til at lave betingelsessætninger)
     *
     * OPGAVEN: Tegn en pyramidefigur vha et tilfældigt tegn indenfor
     * et bestemt sprogområde der vælges af brugeren.
     * Lav tre metoder med flg signaturer:
     * public static int doDiag()
     * public static void doArt(String mySC) 
     * public static int doRand(int userInput)
     * (i den sidste skal konstanten MYRANGE indgå i MAX/MIN-beregningen)
     *
     * Nedenfor er doDiag() lavet så man ikke behøver at tænke over hvilke
     * tal der rammer indenfor hvilke sprog. Er man nysgerrig kan man kigge
     * på https://unicode-table.com/en/. Husk at unicode-værdien er angivet i
     * hexadecimaltal og skal derfor laves om til titals-systemet for at man 
     * kan ramme sprogområdet med heltal.
     *
     *
          ·
         ···
        ·····
       ·······
      ·········
     ···········
     
          ك
         ككك
        ككككك
       ككككككك
      ككككككككك
     ككككككككككك
     
     */

  }
  public static int doDiag() {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast 1536 (Arabisk), 880 (Græsk), 9472 (box) eller bare helt tilfældigt: ");
    int userInt = myScan.nextInt();
    return userInt;
  }
}
