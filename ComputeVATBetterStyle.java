/*
 * FORMÅL:
 * At forbedre et program ved at uddelegere opgaver til metoder 
 *
 * OPGAVE: 
 * Du kan forbedre den første opgave ved at flytte de forskellige opgavetyper
 * ind i passende metoder så main-delen bliver så "tynd" som mulig.
 *
 * Fremgangsmåden er altså flg:
 * 1) kopier eksisterende kode
 * 2) identificér de forskellige opgavetyper 
 * (brugerdialog, uderegninger, visninger)
 * 3) definer passende metoder
 * 4) overvej om main-metoden skal kontrollere flowet mellem opgaverne
 * eller om en separat metode skal stå for den overordnede kontrol.
 *
 */

//TODO: Skriv koden færdig. Sørg for at bruge konstanterne i doView-metoden

import java.util.Scanner;
public class ComputeVATBetterStyle {
  final static int PRCVAT = 25;
  final static String MSG = "MOMS";
  final static String CURRENCY = "Kr";

  public static void main(String[] args){
  // TODO:main-metoden
  }
  // TODO: resten af metoderne. 
  public static void doView(double result, String typeOfResult){
    System.out.printf("");
  }
}
