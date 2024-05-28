/****************************************************************
 * File: OOP_ClassRelationship_Mastery_KunjShah.java
 * By: Kunj Shah
 * Date: 03/29/2024
 * Description: This is a simple code of a flight management system
 *              including HAS-A and IS-A relationship.
 ****************************************************************/

import java.util.*;
public class OOP_ClassRelationship_Mastery_KunjShah {

    static Scanner sc = new Scanner(System.in);

    //welcome msg
    static void welcomeMsg(){
        System.out.println("-".repeat(60));
        System.out.println(" - Book a flight...");
        System.out.println("         NOTE: Please fill it up as mentioned");
        System.out.println("-".repeat(60));
    }

    //The submit thing
    static void confirmSubmit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type 'CHECKOUT' to submit the form: ");
        if (!sc.nextLine().equalsIgnoreCase("CHECKOUT")) {
            System.out.print("Do you want to retry? Type 'YES' to retry:           ");
            if (sc.nextLine().equals("YES")) {
                run();
            }
            System.out.println("-".repeat(60));
            System.out.println(" YOUR FLIGHT IS BOOKED !!!! ");
            System.out.println("-".repeat(60));
        }else{
            System.out.println("-".repeat(60));
            System.out.println(" YOUR FLIGHT IS BOOKED !!!! ");
            System.out.println("-".repeat(60));
        }
    }

    static void run(){

        //colour codes
        String RESET = "\u001B[0m";
        String YELLOW = "\u001B[43m";
        String BLACK = "\u001B[30m";

        welcomeMsg();

        //Name and age
        System.out.println("                - "+YELLOW+BLACK+"Personal Information"+RESET+RESET+" - ");
        System.out.print(" * Enter your name: ");
        String name = sc.nextLine();
        System.out.print(" * Enter your age: ");
        int age = sc.nextInt();
        while(!(age>0 && age<99)){
            System.out.print(" - Please enter valid age: ");
            age = sc.nextInt();
        }

        //Meal information
        System.out.println();
        System.out.println("                        - "+YELLOW+BLACK+"Meal"+RESET+RESET+" -");
        System.out.print(" * Do you have a meal? (Y/N): ");
        char mealReply = sc.next().charAt(0);
        meals mls = new meals();
        mls.setHaveMeal(mealReply);
        meals mls1;
        if (mls.getHaveMeal() == 'Y' || mls.getHaveMeal() == 'y') {
            System.out.println(" - We will serve what you ask...");
            System.out.print(" * What would you like to have?: ");
            sc.nextLine();
            String stringTrial = sc.nextLine();
            mls1 = new meals('Y', stringTrial);
        } else {
            mls1 = new meals('N', "None");
        }

        //dates
        System.out.println();
        System.out.println("                        - "+YELLOW+BLACK+"Dates"+RESET+RESET+" -");
        System.out.print(" * Enter the departure DATE (Not month): ");
        int dt = sc.nextInt();
        if(dt<0 || dt>31){
            while(dt<0 || dt>31){
                System.out.print(" - Enter valid day: ");
                dt = sc.nextInt();
            }
        }
        System.out.print(" * Enter the month: ");
        int mnth = sc.nextInt();
        if (mnth < 0 || mnth > 12) {
            while (mnth < 0 || mnth > 12) {
                System.out.print(" - Enter valid month: ");
                mnth = sc.nextInt();
            }
        }
        if((dt+7) > 30){
            mnth+=1;
        }

        //Airports
        System.out.println();
        System.out.println("                       - "+YELLOW+BLACK+"AIRPORT"+RESET+RESET+" -");
        System.out.print(" * International/Domestic (Enter Int or Dom): ");
        sc.nextLine();
        String intOrDom = sc.nextLine();
        System.out.print(" - Travelling to: ");
        String travellinigTo = sc.nextLine() + " International Airport";
        System.out.print(" - Travelling from: ");
        String travellinigFrom = sc.nextLine() + " International Airport";

        //OBJECTS
        actualHault hlt = new actualHault("Dubai International Airport", dt, mnth, "10:00 PM", "1A", 5, 4);
        pilot plt = new pilot("Shane Watson", 17);
        entertainment ent = new entertainment("YES", "YES", "YES");
        seatType seat_type = new seatType("Economy Class", ent, 1431);
        airCraft air_craft = new airCraft("Airbus A360",366, 4, plt);
        airlineName airline_name = new airlineName("Emirates", air_craft, seat_type);

        departure dpt = new departure(travellinigFrom, dt, mnth, "07:45 AM", "2B", 4);
        arrival arr;
        if(dt > 30 ){
            arr = new arrival(travellinigTo, (dt+1)-30, mnth, "4.00 PM","2",2);
        }else{
            arr = new arrival(travellinigTo, (dt+1), mnth, "4.00 PM","2",2);
        }

        namePerson name_person = new namePerson(name, age,"15A");

        seatNumber seat_number = new seatNumber("27A", "Window seat", "Economy Class");
        person prsn = new person(name_person, mls1, seat_number);

        //Printing
        flight flght = new flight(airline_name, prsn);
        System.out.println("-".repeat(60));
        System.out.println();
        System.out.println(flght.toString());
        System.out.println();
        System.out.println(" - "+YELLOW+BLACK+"FLIGHT DETAILS"+RESET+RESET+" - ");
        System.out.println(dpt.toString());
        if(intOrDom.equalsIgnoreCase("int")){
            System.out.println(hlt.toString());
        }
        System.out.println(arr.toString());
        System.out.println("-".repeat(60));

        confirmSubmit();
    }

    public static void main(String[] args) {
        run();
    }

}
