package maven_exercises;


import org.apache.commons.lang3.StringUtils;


import java.time.chrono.IsoChronology;
import java.util.Scanner;

public class MavenStringUtils {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Something...");
        String input = sc.nextLine();

        System.out.println("You entered: "+ input);
        System.out.println(input+ " reversed is :" +StringUtils.reverse(input));

        if (StringUtils.isNumeric(input)) {
            System.out.println(input+": is a number");
        }else {
            System.out.println(input+": is not a number");
        }

            System.out.println("Reversed case of " + input + " is: " + StringUtils.reverse(input));

        }



}
