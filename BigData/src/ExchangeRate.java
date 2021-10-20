import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;

public class ExchangeRate {

    private  static String exchangeRate = "https://v6.exchangerate-api.com/v6/938306e524f8281f06872e60/latest/USD";

    public static void main (String[] args) throws Exception {

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

            System.out.println(conversion_rates);
            System.out.println();

            NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
            Number mxnRate = (Number) conversion_rates.get("MXN");

            System.out.println(mxnRate);

        }

        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
