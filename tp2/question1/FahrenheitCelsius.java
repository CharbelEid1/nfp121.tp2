package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        for (String arg : args) {
            int fahrenheit = Integer.parseInt(arg);
            float celsius = fahrenheitEnCelsius(fahrenheit);
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                                                                                    // format
                                                                                    // impos�s
        }                                                       // impos�s
                                                                                
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    //converts  fahrenheit to celsius
    public static float fahrenheitEnCelsius(int f) {

       float result = (5.0f / 9.0f) * (f - 32);
        result = ((int) (result * 10)) / 10.0f;
        return result;
    }

}
