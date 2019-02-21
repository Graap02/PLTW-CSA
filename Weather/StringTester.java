
/**
 * Write a description of class StringTester here.
 *
 * @author Jayden Graap
 * @version Weather App 1.1.4
 */
import javax.swing.JOptionPane;
public class StringTester
{
   public static void main() 
   {
   String result;
   String result2;
   int intResult;
   result = JOptionPane.showInputDialog(null, "What is the weather conditions?" 
   );
   result2 = JOptionPane.showInputDialog(null, "What is the temperature today? "
   );
   intResult = Integer.parseInt(result2);
   System.out.println(WeatherConditionals.getWeatherAdvice(intResult, result));
   }
}
