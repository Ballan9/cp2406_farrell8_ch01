import java.util.Scanner;

public class NameCheck
    {
        public static void main(String[] args) {
            String PersonName = getName();
            System.out.println(" Welcome "+PersonName);
            String SexyorNot = PersonStatus (PersonName);
            System.out.println(SexyorNot);
        }
        public static String getName(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name = s.nextLine();
        return name;

        }
        public static String PersonStatus(String PersonName){
            if (PersonName.equals("allan")) {
                String PersonThing = "You da sexy";
                return PersonThing;
            }
            else {
                String PersonThing = "You not da sexy";
                return PersonThing;
            }


        }

}
