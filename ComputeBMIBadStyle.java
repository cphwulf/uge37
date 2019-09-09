/*
 * FORMÅL:
 * At se hvordan klassevariabler kan tilgås og ændres
 *
 * OPGAVE:
 * Du skal bare sørge for at main-delen virker. 
 *
 * */

import java.util.Scanner;
public class ComputeBMIBadStyle {
  static double weightKg,heightM,BMI;

  public static void doDiag() {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast din vægt i kg:");
    weightKg = myScan.nextDouble();
    System.out.println("Indtast din højde i meter:");
    heightM = myScan.nextDouble();
    System.out.println(weightKg);
    System.out.println(heightM);
  }

  public static void doMath() {
    BMI=weightKg/(heightM*heightM);
  }

  public static void doPrint() {
    System.out.println("BMI: " + BMI);
  }

  public static void main(String[] args){
    //TODO: kald metoderne
  }
}
