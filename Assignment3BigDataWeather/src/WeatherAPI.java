/* Mario Rodriguez, CS 211
 * 980384835
 * November 14, 2021;
 * Bellevue College
 * WeatherAPITest -
 * Description:
 *  The Weather API class takes in a city name and a category it returns the category requested from the specific city.
 *  It does not return a value, but instead prints the information related to the requested city and category.
 */

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WeatherAPI {

    private static String apiKey = "fb7d7af4019ac94fbf5e8338f9f77814"; //should be hidden by 'env' variable
    static Map<String, String> menuChoices = new HashMap<>(); //Dict to store and map requests and api variables

    static {
        //main choices
        menuChoices.put("Temperature", "temp");
        menuChoices.put("Pressure", "pressure");
        menuChoices.put("Humidity", "humidity");

        //wind choices
        menuChoices.put("Wind Speed", "speed");
        menuChoices.put("Wind Degree", "deg");
        menuChoices.put("Wind Gust", "gust");

        //weather description
        menuChoices.put("Weather", "description");
    } //used to build menuChoices dict.

    public static void getCityWeather(String cityName, String category) {

        String city = cityName.toLowerCase(Locale.ROOT);
        String baseURL = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&units=imperial&" + "appid=" + apiKey;
        StringBuilder builder = new StringBuilder();

        try {

            URL url = new URL (baseURL);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            String countryName;

            while (null != (str = br.readLine())) {
                builder.append(str).append("\n");
            }

            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(builder.toString());
            JSONObject jsonObject = ((JSONObject) obj);

            //used to filter out the different available JSON obj

            if(category == "Temperature" || category == "Pressure" || category == "Humidity") {

                //chose main values
                JSONObject city_weather_data = (JSONObject) jsonObject.get("main");
                JSONObject country = (JSONObject) jsonObject.get("sys");
                countryName = (String) country.get("country");

                System.out.println();//space

                NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
                Number number = format.parse(String.valueOf(city_weather_data.get(menuChoices.get(category))));
                double measure = number.doubleValue();

                System.out.println("City: " + cityName);
                System.out.println("Current " + category + ": " + measure);
                System.out.println("Country: " + countryName);
                System.out.println();

            } else if (category == "Wind Speed" || category == "Wind Degree" || category == "Wind Gust" ) {

                //chose wind values
                JSONObject city_weather_data = (JSONObject) jsonObject.get("wind");
                JSONObject country = (JSONObject) jsonObject.get("sys");
                countryName = (String) country.get("country");

                System.out.println();//space

                NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
                Number number = format.parse(String.valueOf(city_weather_data.get(menuChoices.get(category))));
                double measure = number.doubleValue();

                System.out.println("City: " + cityName);
                System.out.println("Current " + category + ": " + measure);
                System.out.println("Country: " + countryName);
                System.out.println();

            } else {
                //chose weather description
                JSONArray city_weather_data = (JSONArray) jsonObject.get("weather");

                System.out.println(city_weather_data);
                System.out.println();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}