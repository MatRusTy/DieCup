/**
 * This class models a DieCup (raflebæger)
 * 
 * @author Kurt Jensen
 * @version 2017-05-01
 **/
public class DieCup {
    private Die d1;             //first die
    private Die d2;             //second die
    public int maxEyes;         //højeste sum af slag
    public int sum;             //sum af øjne
    private float cumulativ;    //Samlede sum af øjne fra flere kast
    private float average;      //Gennemsnit øjne for kast
    private int noOfRolls;      //Antal ønskede kast 
    /**
     * Constructor for DieCup objects
     * Laver to terning-objekter fra terning-klassen
     */
    public DieCup() {
        d1 = new Die();
        d2 = new Die();
    }
    
    /**
     * Return the sum of the number of eyes shown by the two dies
     */
    public int getEyes() {
        return sum;
    }

     /** 
     * Denne metode kalder roll() metoden på de to objekter d1 og d2
     */
    public void roll() {
       d1.roll();
       d2.roll();
       sum = d1.eyes + d2.eyes; // Summerer de to terningers værdier.
       maxEyes = Math.max (sum , maxEyes); 
       
       /**
        * Math.max tager to parametre og returnerer den største værdi, som så bliver maxEyes nye værdi.  
        * Den ene parameter er summen af det sidste kasts værdier, og den anden er den største sum fra tidligere kast.
       */ 
    }
        
    /**
     * Denne metode returnerer værdien af maxEyes.
     */
    public int getMaxEyes() {
        return maxEyes;
    }
    
    /**
     * Denne metode sætter maxEyes til 0
     */
    public void resetMaxEyes() {
        maxEyes = 0;
    }
    
            /**
     * OPGAVE 5
     * 
     * Følgende metode har en parameter noOfRolls. Den benytter et for-loop
     * til at kalde roll() metoden noOfRolls gange. I hvert loop printes resultatet af
     * et kast til terminalen.
     * 
     * Løbende findes det kumulative antal af øjne. 
     * Dette bruges til at udregne gennemsnittet af øjne når for-loopet slutter.
     */
    
    void multipleRolls(int noOfRolls) {
        
       ++noOfRolls; //Der lægges 1 til noOfRolls da vi starter "i" fra 1.
        
        for( int i = 1; i < noOfRolls; i++) {
            roll();
            System.out.println("Throw number " + i + ": " + sum);
            
            cumulativ += sum;
        }
        
        average = cumulativ / noOfRolls;
        
        System.out.println("Average: " + average);
        
        cumulativ = 0;
        
    }
}
        
