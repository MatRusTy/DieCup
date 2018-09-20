
/**
 * Write a description of class TestDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestDriver
{
    // instance variables - replace the example below with your own
    private int x;
    public DieCup dieCup;
    
    
    /**
     * Constructor for objects of class TestDriver
     */
    public TestDriver()
    {
        // initialise instance variables
        x = 0;
    }

    public void test(){
        dieCup = new DieCup();
        
        dieCup.roll();
        
        System.out.println(dieCup.sum);
        
        
        
    }
    
}
