/* Mario Rodriguez, CS 211
 * 980384835
 * May 5, 2021
 * Bellevue College
 * MyBurgerTest class main - Instantiates Burger211 objects using the sub-classes for each region (US and Mexico)
 * for four different franchise locations - US (Seattle & Bellevue) and Mexico (Mexico City & Gudalajara)
 * Requirements:
 *  - Each country displays their own style of menu because of different language, currency and culture
 *  - All the Burger211 shops in the same country display the same format of menu except promotion at their shop.
 *  - Menu contains the shop name, promotion information, all 3 burger names, prices, and toppings.
 *  - The prices should be displayed in their own currency.
 *  - Franchise can hold individual promotional events with special discounts.
 *  - If people in the country don't eat certain topping, the topping can be removed or replaced them with other toppings
 */

public class MyBurger211Test {

    public static void main (String[] args) throws Exception {

        // US franchises - Seattle and Bellevue
        Burger211 Bellevue = new USA();
        Bellevue.Promotion(0.1, "10% Off - BTS Bellevue College Concert Special");
        Bellevue.Menu("Bellevue");

        Burger211 Seattle = new USA();
        Seattle.Promotion(.5, "50% Off - If you're vaccinated");
        Seattle.Menu("Seattle");

        // Mexico franchises - Mexico City and Guadalajara
        Burger211 Guadalajara = new Mexico();
        Guadalajara.Promotion(0.05, "5% Off - Puerto Vallarta Special ");
        Guadalajara.Menu("Guadalajara");

        Burger211 mexicoCity = new Mexico();
        mexicoCity.Menu("Mexico City - DF");

    }

}
