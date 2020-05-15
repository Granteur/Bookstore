import java.io.IOException;
import java.time.*; // import the LocalTime class
import java.time.format.DateTimeFormatter;//format time
import java.util.ArrayList; //import ArrayLists

import bookstore.Utils;

public class Bookstore{
    static String store = "Flourish and Blotts";

    public static void storeHours() {
        //option 1 in main method
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = currentTime.format(formatTime);
        System.out.println("The time is now " + formattedTime);

        System.out.println(store + " is open every day from 8:00am to 9:00pm");

        System.out.println(store
                + " is closed for the following major holidays, New Year's Day, Good Friday, Christmas Day, and Boxing Day.");

        //Probably put this in the genres section
        //System.out.println("For you forgetful few, we do have updated copies of the most recent required books for new and returning Hogwarts students.");
    }

    public static void storeHistoryFacts(){
        //option 2 in main method
        System.out.println(store + "has been proudly serving the Wizarding community since it was founded back in 1654.");
        System.out.println("Our main location is a 1000 sq meter building conveniently located on the right side of Diagon Alley, just after entering through The Leaky Cauldron; Please don't hesitate to ask Tom for directions on the way in. We also are connected to the Floo Network and can accept mail orders via Owl Post, for those magical few who are are wary of the Muggle virus COVID-19 that has been rather prevalent lately.");
    }

    private ArrayList<String> titles;

    private void loadTitles(){
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

    //later separate books by department
    //public static void transfigurationDept(){}




}