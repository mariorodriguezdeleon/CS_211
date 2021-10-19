/* Mario Rodriguez, CS 211
 * 980384835
 * October 22, 2021
 * Bellevue College
 * MyBurgerTest class - Instantiates Burger211 objects for four different franchise locations - US and Mexico
 * Description:
 * The USA.java class is used to instantiate a franchise object for US locations.
 * This class overrides the abstract classes defined by the Burger211 abstract class.
 * This class also contains variables to capture discount rate, promotion banner and an array for the number of burgers
 * defined by the Burger() in the abstract class
 */

import java.text.DecimalFormat;
import taesik.MenuGUI;

public class USA extends Burger211 {

    private double discountRate = 0;
    private String [] burgerNamePrice = new String[getHowManyBurgers()];
    String pro = "";

    @Override
    public void Promotion(Double discountRate, String promote) {
        this.discountRate = discountRate;
        pro = promote;
    }

    @Override
    public void Menu(String franchise) {
        DecimalFormat df = new DecimalFormat("#,###,###.00");

        for (int i = 0; i < getHowManyBurgers(); i++) {
            burgerNamePrice[i] = getBurgerName(i) + "/" + "$" + df.format(getBurgerPrice(i) * (1.0 - discountRate));
            if (discountRate > 0.0) {
                burgerNamePrice[i] += " (regular: $" + df.format(getBurgerPrice(i)) + ")";
            }
        }

        new MenuGUI (franchise, pro, burgerNamePrice[0], getBurgerTopping(0), burgerNamePrice[1], getBurgerTopping(1), burgerNamePrice[2], getBurgerTopping(2));

    }

}