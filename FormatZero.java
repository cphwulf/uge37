public class FormatZero {
  public static void main(String[] args) {

    double outVar = 123.11;
    String outString = "Kurt Verner";
    int outInteger = 7888666;

    /*
     * FORMÅL:
     * Øve komposition, Math og afrunding
     *
     * OPGAVER:
     * opgave 1)
     * Producer flg output med printf og de tre variabler
       |123,1100|
       |   123,1100|
       |123,1|
       | 123,110|
       7888666
       7.888.666
       |     Kurt Verner|
     *
     * opgave 2)
     * kvadratroden af 675 er afrundet på 14 decimal 25.98076211353316
     * udregn og gem kvadratroden korrekt afrundet på 2. decimal kun ved
     * hjælp af Math og de almindelige regnefunktioner.
     *
     * opgave 3)
     * Samme som i opg 2) men nu med 3 decimaler
     *
       */
    // Start sådan her :
    System.out.printf("|%f|%n",outVar);
    //TODO: resten af opg 1
    
    // Start sådan her: 
    double mySqrt = 100.0;
    System.out.println(mySqrt);
    //TODO: resten af opg 2
    
    // Start sådan her: 
    double mySqrt2 = 100.0;
    System.out.println(mySqrt);
    //TODO: resten af opg 3
  }
}
