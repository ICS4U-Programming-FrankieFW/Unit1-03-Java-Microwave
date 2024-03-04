
/**
* This program is used for microwaving food such as pizza, sub, and soup
*
* @author Frankie Fox
* @version 1.0
* @since   2024-28-02
*/
import java.util.*;


   
import java.util.Scanner;

public class Microwave {
    public static void main(String[] args) {
        // microwave times in seconds
        final int PIZZA_TIME = 45;        
        final int SUB_TIME = 60;    
        final int SOUP_TIME = 105;

        //This is the string for userItems 
        String userItems;
        //This is the int for the userAmount
        int userAmount;
        //This the int for time which is 0
        int time = 0;
        //This int for minutes
        int minutes;
        //This int for seconds
        int seconds;

        try {
            Scanner sc = new Scanner(System.in);

            //This prints out to the user asking for pizza, sub or Soup
            System.out.print("Please enter your food (Pizza, Sub, or Soup): ");
            userItems = sc.nextLine();

            //This prints out the amount the user would like 
            System.out.print("How much would you like (1, 2, or 3): ");
            userAmount = sc.nextInt();

            //This checks if the coe is more than three or if zero is bigger than the user amount
            if (userAmount <= 0 || userAmount > 3) {
                //This prints out please put in a number that is in the 1-3
                System.out.println("Please put in a number that is in the range of 1-3");
            }
            else if (!userItems.equalsIgnoreCase("Pizza") && !userItems.equalsIgnoreCase("Sub")
                    && !userItems.equalsIgnoreCase("Soup")) {
                System.out.println("Please enter pizza, sub, or soup");
            }
            else {

                //This is the switch case to calculate the total time in seconds
                switch (userItems.toLowerCase()) {
                    //This is the case sub
                    case "sub":
                        //This is the sub time 105 seconds 
                        time = SUB_TIME * userAmount;
                        break;
                    //This is the soup case
                    case "soup":
                        //This is the soup time 90 seconds
                        time = SOUP_TIME * userAmount;
                        break;
                    //This is the pizza case 
                    case "pizza":
                        //This is the pizza time 60 seconds 
                        time = PIZZA_TIME * userAmount;
                        break;
                }
                
                minutes = time / 60;
                seconds = time % 60;               

                //This is the equation that formats it into a sentence with the answer on minutes and seconds 
                System.out.println("To microwave " + userAmount + " " + userItems + ", it will take " + minutes
                        + " minutes and " + seconds + " seconds.");
            }

            

        } catch (Exception e) {
            //this catches any errors that are inputted by the user 
            System.out.println("Error: Invalid input entered.");
        }
    }
}

