
/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 * 
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName {
    /**
     * All input that you provide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * <p>
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main(String args[])
    {
        String nameChars = "";
        String nameChars2 = "";
        String nameChars3 = "";
        String nameChars4 = "";



        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        nameChars = firstName.substring(0, 3);
        nameChars2 = lastName.substring(0, 2);
        String sciFiFirst = nameChars + nameChars2;

        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        nameChars3 = city.substring(0, 2);
        nameChars4 = school.substring(0, 3);
        String sciFiLast = nameChars3 + nameChars4;

        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        Math.random();
        int r = (int)Math.random() * relativeName1.length() + 2;
        int t = (int)Math.random() * relativeName2.length() + 4;
        String h = relativeName1.substring(r);
        String k = relativeName2.substring(t);
        String v = h + k;
        System.out.println(sciFiFirst + " " + sciFiLast + " " + v);
    }
}
