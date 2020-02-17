public class OrderOfPrec
{
  public static void main(String[] args)
  {
    /*
     * OPGAVE: 
     *
     * 1) ret så flg. bliver korrekt (brug printf, parenteser, typecasting etc)
     * 0.3333333333333333 = 1/3; //kun vha println
     * 0.33333334 = 1/3; //kun vha println
     * 0.33 = 1/3; 
     * 144 = 12*2+2*4-1
     * 6 = 14/7*2+30/5+1
     * 7.55 = Math.round(Math.sqrt(57)*100/100.0);
     * 0 = 89 + 1 % 5 / (10 % 6)
     * 11 = 17%(10+4)
     *
     * Sæt parenteser så flg kan kompileres og resultatet bliver 19
     * int a=(int)23-9/Math.sqrt(7)
     * Kan flg fungere som et terninge kast?
     * int val =(int) Math.random()*6+1
     *
     */
    // start sådan her (og den her er ikke korrekt):
    double myD = 1/3;
    // TODO:resten 

    // slut sådan her:
    System.out.println(myD);
    // TODO:resten af print
  }
}
