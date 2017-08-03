import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Scanner;

public class NameCheck
    {
        public static void main(String[] args) {
            String PersonName = getName();
            /* This printed welcome message, Not needed after adding
            System.out.println(" Welcome "+PersonName);
             */
            String SexyorNot = PersonStatus (PersonName);
            JOptionPane.showMessageDialog(null, SexyorNot);

        }
        public static String getName(){
           // This function Uses dialog box for input
            String name;
            name = JOptionPane.showInputDialog(null, "Please Enter Your Name");
            JOptionPane.showMessageDialog(null, "Welcome " + name);
            return name ;
      /*  This function grabs input in the IDE
      Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name = inputDevice.nextLine();
        String lower = name.toLowerCase();
        return lower; */

        }
        public static String PersonStatus(String PersonName){
           //Checks if the name is sexy or not
            if (PersonName.equals("allan") || PersonName.equals ("jesse") || PersonName.equals("cameron")
                   || PersonName.equals ("sanio") || PersonName.equals("daniel") || PersonName.equals("damo")) {
                String PersonThing = "You da sexy";
                return PersonThing;
            }
           /* {
            if (PersonName.equals ("shae");
                String PersonThing = "You da slutty";
                return PersonThing;
            } */

            else {
                String PersonThing = "You not da sexy";
                return PersonThing;
            }


        }

}
