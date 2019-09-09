class ModuloPrime {
  public static void main(String[] args) {
    /*
     * FORMÅL:
     * Få erfaring med modulo-operatoren
     * og oplev at skulle klare sig med få værktøjer
     * (da vi endnu ikke har loops and logic)
     *
     * OPGAVE:
     * Et primtal er et positivt heltal større end 1, 
     * der ikke er deleligt med andre hele positive tal end 1 
     * og tallet selv,
     *
     * 1) 
     * Løs den i første omgang med statisk input og uden metode
     * Brug modulo-operatoren, variablen startTal og System.out.println 
     * til at lave en primtalstest med et heltal mellem 2 og 20
     *
     * F.eks for tallet 5 skal programmet vise: 
     
        Hvis mere end to af nedenstående udsagn er sande så er 5 ikke et primtal
        0==0
        1==0
        2==0
        1==0
        0==0
        5==0
        5==0
        5==0
        5==0
        5==0
        5==0
        5==0
        5==0
        5==0
        5==0
        5==0
        5==0
        5==0
        5==0
        5==0

     * 2) Løs den nu med Scanner-input så input bliver dynamisk.
     * Lav en metode hvor selve testen og outputtet bliver udregnet og vist. 
     * Giv Scanner-input med som parameter til metoden.
     * Fremgangsmåden er at copy-paste så meget som muligt af den gamle kode.
     */

    int startTal = 5;
    System.out.println("Hvis mere end to af nedenstående udsagn er sande så er " + startTal + " ikke et primtal");
    System.out.println("==0");
    //TODO:resten op til og med 20
    }
}
