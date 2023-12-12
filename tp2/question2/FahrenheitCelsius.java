package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
        for (String arg : args) {
            try {
                int fahrenheit = Integer.parseInt(arg);
                float celsius = fahrenheitEnCelsius(fahrenheit);
                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
    public static float fahrenheitEnCelsius(int f) throws NumberFormatException {
        float result = (5.0f / 9.0f) * (f - 32);
        result = ((int) (result * 10)) / 10.0f;
        return result;
    }

}
