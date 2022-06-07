// Demonistration of switch case

import java.util.*;
public class Scase {
    public static void main(String [] args){
        // get input
        System.out.println("Enter a number:");
        try (Scanner s = new Scanner(System.in)) {
            int choice = s.nextInt();

            // switch case
            switch(choice){
                case 1: System.out.println("Sunday");
                        break;

                case 2: System.out.println("Monday");
                        break;

                case 3: System.out.println("Tuesday");
                        break;

                case 4: System.out.println("Wednesday");
                        break;

                case 5: System.out.println("Thrusday");
                        break;

                case 6: System.out.println("Friday");
                        break;

                case 7: System.out.println("Saturday");
                        break;

                default: System.out.println("Invalid!, choose(1 - 7)");
                        break;
            }
        }
    }
}
