/* Mario Rodriguez, CS 211
 * 980384835
 * November 14, 2021;
 * Bellevue College
 * WeatherTest -
 * Description:
 * The WeatherTest class is the main program that initiates a simple test of the WeatherAPI class.
 * This class creates two HashMaps, 'myCities and menuItems -> which are filled with the following
 * anonymous classes (each class adding, 'putting' a record into the aforementioned classes; these Maps are used to
 * display menu items, both for cities and for their available weather data.
 *
 * The program continually asks the user for input as long as the user's response is not 0 for the city query. If the
 * city query returns 0 the program terminates. There is built in validation for both menu queries -> asking for the user
 * to enter a valid integer; please note that there is no validation for inquiries beyond the final listed menu item
 * for each list - Validation do follow.  But, as long as the input is not a positive integer, the program will
 * continuously ask the user for valid input.
 *
 */
import java.util.*;

public class WeatherTest {

    //Creates a new HashMap to store selected cities
    static Map<Integer, String> myCities = new HashMap<>();
    //Creates a new HashMap to store selected menu items
    static Map<Integer, String> menuItem = new HashMap<>();

    //anonymous class to build list of selected cities as a string of city to plug into the url
    static {
        myCities.put(1, "Los Angeles");
        myCities.put(2, "Guadalajara");
        myCities.put(3,"Soa Paulo");
        myCities.put(4, "Lima");
        myCities.put(5, "Frankfurt");
        myCities.put(6,"Zurich");
        myCities.put(7, "Florence");
        myCities.put(8, "Budapest");
        myCities.put(9,"Florence");
        myCities.put(10,"Barcelona");
    } // add my chosen cities to the hashmap
    //anonymous class to build list of selected menu items
    static {
        menuItem.put(1, "Weather");
        menuItem.put(2, "Pressure");
        menuItem.put(3, "Temperature");
        menuItem.put(4, "Humidity");
        menuItem.put(5, "Wind Speed");
        menuItem.put(6, "Wind Degree");
        menuItem.put(7, "Wind Gust");
    } // add the menu items

    public static void main (String[] args) throws Exception {

        int citySelection;
        int menuSelection = 0;
        boolean keepGoing = true;

        WeatherAPI weatherObj = new WeatherAPI();

        do {

            //Get user input -> method validates input to ensure positive integer
            citySelection = getCityInput();

            if (citySelection != 0) {

                menuSelection = getMenuItems();

                weatherObj.getCityWeather(myCities.get(citySelection), menuItem.get(menuSelection));

            } else {
                keepGoing = false;
            }

        } while (keepGoing);

    }

    public static int getCityInput () {

        int userResponse = 0 ;
        boolean flag = true;

        do {
            try {

                Scanner input = new Scanner(System.in);
                System.out.println("Select a city: ");
                System.out.println("");

                //prints city menu
                for (int i = 1; i < myCities.size() + 1; ++i) {
                    String s = myCities.get(i);
                    System.out.println(i + ". " + s);
                }
                //receives user input
                userResponse = input.nextInt();

                flag = false;

            } catch (Exception e) {
                //accept integer only
                System.out.println("Enter only available menu item.." + e);
                flag = true;
            }
        } while (flag);

        return userResponse;
    }

    public static int getMenuItems () {

        int userResponse = 0 ;
        boolean flag = true;

        do {
            try {

                Scanner input = new Scanner(System.in);
                System.out.println("Select one: ");
                System.out.println("");

                //prints city menu
                for (int i = 1; i < menuItem.size() + 1; ++i) {
                    String s = menuItem.get(i);
                    System.out.println(i + ". " + s);
                }
                //receives user input
                userResponse = input.nextInt();

                flag = false;

            } catch (Exception e) {
                //accept integer only
                System.out.println("Enter only available menu item.." + e);
                flag = true;
            }
        } while (flag);

        return userResponse;

    }

}
