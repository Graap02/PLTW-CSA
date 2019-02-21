
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description){
        boolean windy = false;
        
        if(description.indexOf("windy") >= 0) {
         windy = true;   
        }
        if((temperature > 100) && (description.indexOf("snow") >= 0)) {
         return("Fake news");   
        }
        if(!windy && (temperature < 30)) {
            return("It's safe to go outside: " + temperature + " degrees and "
            + description + ".");
        }
        else
        return "Too windy or cold! Enjoy watching TV or playing video games.";
    }
}
//25 27 and 28, and conclusions, don't forget to do those/answer them ;)