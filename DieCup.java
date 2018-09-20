/**
 * This class models a DieCup (rafleb�ger)
 * 
 * @author Kurt Jensen
 * @version 2017-05-01
 **/
public class DieCup {
    private Die d1;             //first die
    private Die d2;             //second die
    public int maxEyes;         //h�jeste sum af slag
    public int sum;             //sum af �jne
    private float cumulativ;    //Samlede sum af �jne fra flere kast
    private float average;      //Gennemsnit �jne for kast
    private int noOfRolls;      //Antal �nskede kast 
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
     * Denne metode kalder roll() metoden p� de to objekter d1 og d2
     */
    public void roll() {
       d1.roll();
       d2.roll();
       sum = d1.eyes + d2.eyes; // Summerer de to terningers v�rdier.
       maxEyes = Math.max (sum , maxEyes); 
       
       /**
        * Math.max tager to parametre og returnerer den st�rste v�rdi, som s� bliver maxEyes nye v�rdi.  
        * Den ene parameter er summen af det sidste kasts v�rdier, og den anden er den st�rste sum fra tidligere kast.
       */ 
    }
        
    /**
     * Denne metode returnerer v�rdien af maxEyes.
     */
    public int getMaxEyes() {
        return maxEyes;
    }
    
    /**
     * Denne metode s�tter maxEyes til 0
     */
    public void resetMaxEyes() {
        maxEyes = 0;
    }
    
            /**
     * OPGAVE 5
     * 
     * F�lgende metode har en parameter noOfRolls. Den benytter et for-loop
     * til at kalde roll() metoden noOfRolls gange. I hvert loop printes resultatet af
     * et kast til terminalen.
     * 
     * L�bende findes det kumulative antal af �jne. 
     * Dette bruges til at udregne gennemsnittet af �jne n�r for-loopet slutter.
     */
    
    void multipleRolls(int noOfRolls) {
        
       ++noOfRolls; //Der l�gges 1 til noOfRolls da vi starter "i" fra 1.
        
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
        
