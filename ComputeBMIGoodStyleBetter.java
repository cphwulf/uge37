/*
 * Nøjagtig samme main-indhold. Men modificer doDiag så selve 
 * maskeringen af de to tal sker i en anden metode. Dermed sørger
 * man for at doDiag kun tager sig af selve dialogen og ikke blander
 * logik med visning.
 * 
 */
import java.util.Scanner;
public class ComputeBMIGoodStyleBetter {
  public static void main(String[] args){
    int userRetVal=doDiag();
    double userBMI = computeBMI(userRetVal);
    doPrint(userBMI);
  }

  public static int doDiag() {
    //TODO: lav metoden doMasking
    int retVal = doMasking(weightKg,heightM);
    return retVal;

  }
}
