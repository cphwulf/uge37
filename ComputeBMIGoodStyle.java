import java.util.Scanner;
public class ComputeBMIGoodStyle {
  public static void main(String[] args){
    /*
     * FORMÅL:
     * At få kendskab til integerdivision, typecasting, order-of-precedence, 
     * at bygge metoder og returnere værdier 
     *
     * OPGAVE:
     * Abstrakt formuleret: At kunne gemme to tal i ét tal 
     * konkret eksempel:
     * 1,75 og 65,5 gemmes i hver sin del af 100000
     * Så opgaven består i at lave en beregning på de to decimal-tal
     * så de bliver til ét heltal - i dette eksempel til 175655
     *
     * Det vil være en god øvelse at løse opgaven som beskrevet i bogens kap
     * 4.8. Dvs man bygger først en skal omkring selve den algoritmiske udfordring:
     * At gemme to tal i ét tal. Man kan med fordel bygge videre på den foregående opgave hvor
     * man istedet for de "globale" klassevariablerne benytter sig af "lokale" variabler, dvs variabler
     * som kun er kendt af den enkelte metode.
     *
     */

    // TODO: kald til doDiag, computeBMI og doPrint
  }

  public static int doDiag() {
    int heightWeight = 0;
    // TODO: Få brugerinput og gemme højden i den øverste del af tallet 
    // og vægten i den nederste del
    return heightWeight;

  }
  public static double computeBMI(int userVal) {
    double height,weight,bmi=0;
    //TODO: regne baglæns så den øverste og nederste del trækkes ud
    // i to variable:
    return bmi;
  }

  public static void doPrint(double BMI) {
    System.out.println("BMI: " + BMI);
  }
}
