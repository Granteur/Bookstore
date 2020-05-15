import java.util.ArrayList;
import java.util.Scanner; //Import Scanner class
import java.time.LocalTime; // import the LocalTime class

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Thank you for choosing Flourish and Blotts! How can we help you today?");
        System.out.println("Please choose from the following options: ");
        
        System.out.println("For our location's hours, please choose option '1'");
        String optionOne = input.nextLine();
        if (optionOne == "1"){
            Bookstore.storeHours();
        }
        System.out.println("For a brief history of the store, please choose option '2'");
        String optionTwo = input.nextLine();
        if (optionTwo == "2"){
            Bookstore.storeHistoryFacts();
        }

        System.out.println("These are the titles we have available at the moment.");
        Bookstore();
    }
    public Bookstore(String name, String address){
        this.name = name;
        this.address = address;

        // all other members set here

        // init the array and then load it.
        titles = new ArrayList<String>();
        loadTitles();
    }
}