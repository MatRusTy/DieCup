// import class for generation of random numbers
import java.util.Random;

/**
 * This class models a Die (terning)
 * 
 * @author Kurt Jensen
 * @version 2017-01-05
 */
public class Die {
    private Random random;  //used for generation of random numbers
    public int eyes;        //number of eyes shown

    /**
     * Constructor for Die objects
     */
    public Die() {
        random = new Random();
    }

    /**
     * Benytter Random klassen fra Java utility bibliotek. nextInt tager en parameter,
     * som angiver den øvre grænse.
     * Der adderes med 1 for at skubbe udfaldsintervalet fra [0:5] til [1:6].
     * 
     */
    public void roll() {
        eyes = random.nextInt(6)+1;
    }

    /**
     * Denne metode returnerer int eyes.
     */
    public int getEyes() {
        return eyes;
    }
}
