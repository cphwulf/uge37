import java.util.Scanner;
public class SpeakToMe {
  public static void main(String[] args){
    /*
     * FORMÅL:
     * At få kendskab til scanner-klassen, integerdivision
     * typecasting, order-of-precedence, at bygge metoder og returnere
     * værdier
     *
     * Opgave 
     * 1)
     *
     */

    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast din alder: ");
    int age = myScan.nextInt();
    System.out.println("Indtast dit fulde navn");
    myScan.nextLine();
    String kundeNavn = myScan.nextLine();
    System.out.println("Indtast din vægt i kg:");
    double kiloVægt = myScan.nextDouble();
    System.out.println("Indtast din højde i centimeter:");
    int meterHoejde = myScan.nextInt();

    // TODO: gem vægt og højde i samme heltal
    // heightWeight = xy ;
    // height = x;
    // weight = y;
    //
    // exempel:
    // 175065,5
    // height = 175;
    // weight = 65,5;
    //
    int height;
    double weight;
    int tmpHeight = meterHoejde * 1000;
    double tmpWeight = kiloVægt * 10;
    int heightWeight = (int) (tmpHeight + tmpWeight);
    System.out.println("Samlet: " + heightWeight);

    // nu splitter vi det igen
    height = heightWeight / 1000;
    // så skal vi have trukket højden ud af tallet
    weight = (heightWeight - (height*1000))/10.0;
    System.out.println("Opdelt H: " + height + "W: " + weight);

  }
}
