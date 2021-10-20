/* Mario Rodriguez, CS 211
 * 980384835
 * October 22, 2021;
 * Bellevue College
 * ExchangeRate Class - Leveraged to instantiate a currency exchange object by the Burger211 subclasses
 * to provide real-time exchange rates for the different franchise locations. Each location passes their
 * country three-letter country code to set their rates
 * Description:
 * The rate is based on the US dollar and converted to the appropriate rate requested by the local franchise.
 */

package mario;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ExchangeRate {

    private String exchangeRate = "https://v6.exchangerate-api.com/v6/938306e524f8281f06872e60/latest/USD";
    Number countryExchange;
    String countryName;

    public ExchangeRate(String countryName) {

        this.countryName = countryName;

        //define JSON object and read the JSON file.
        StringBuilder builder = new StringBuilder();

        try {
            URL url = new URL (exchangeRate);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String str = "";

            while (null != (str = br.readLine())) {
                builder.append(str + "\n");
            }

            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(builder.toString());
            JSONObject jsonObject = ((JSONObject) obj);
            JSONObject conversion_rates = (JSONObject) jsonObject.get("conversion_rates");
            Number mxnRate = (Number) conversion_rates.get(countryName);

            countryExchange = mxnRate;
        }

        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public double getCountryExchange () {
        return (double) countryExchange;
    }

}
