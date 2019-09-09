import java.util.Scanner;
public class SpeakToMeBetter {
  public static void main(String[] args){
    /*
     * FORMÅL:
     * At få kendskab til scanner-klassen, integerdivision
     * typecasting, order-of-precedence, at bygge metoder og returnere
     * værdier
     *
     * OPGAVE:
     * Abstrakt formuleret: At kunne gemme to tal i ét tal 
     * konkret eksempel:
     * 1,75 og 65,5 gemmes i hver sin del af 100000
     * Så opgaven består i at lave en beregning på de to decimal-tal
     * så de bliver til ét heltal - i dette eksempel til 175655
     * 
     *
     */

    int userRetVal=doDiag();
    System.out.println("Samlet: " + userRetVal);
    double userBMI = computeBMI(userRetVal);
    System.out.printf("bmi: %.2f%n",userBMI);

  }

  public static int doDiag() {
    int heightWeight;
    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast din vægt i kg (ex:63,4):");
    double kiloVægt = myScan.nextDouble();
    System.out.println("Indtast din højde i meter(ex: 1,75):");
    double meterHoejde = myScan.nextDouble();
    // TODO: gemme højden i den øverste del af tallet og vægten i den nederste del
    heightWeight= (int)(meterHoejde * 100) * 1000;
    heightWeight = heightWeight + (int)(kiloVægt * 10); 
    System.out.println("Samlet: " + heightWeight);
    return heightWeight;

  }
  public static double computeBMI(int userVal) {
    double height,weight;
    //TODO: regne baglæns så den øverste og nederste del trækkes ud
    // i to variable:
    height = userVal / 1000.0 / 100.0;
    weight = (userVal % 1000) / 10.0;
    double bmi = weight / ( height * height);
    return bmi;
  }
}
