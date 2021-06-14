package question1;


/**
 * Write a description of class testFahrenheitCelcius here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testFahrenheitCelcius
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        int fahrenheit = 0;
        float celsius = 0;
            for(int i=0 ; i<args.length ; i++){
            fahrenheit = Integer.parseInt(args[i]);
            celsius = fahrenheitEnCelsius(fahrenheit);
            System.out.println(fahrenheit + "\u00B0F -> " + String.format("%.1f", celsius) + "\u00B0C");
        }
              
        // ligne,
        // format
        // imposés
                                                                                
    }
    
    
    
    /**
     * Constructor for objects of class testFahrenheitCelcius
     */
    public testFahrenheitCelcius()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
