/* Mario Rodriguez, CS 211
 * 980384835
 * October 22, 2021;
 * Bellevue College
 * Quiz 5: Set Operations
 *   Based on Slide # 35 (Week 3-3)
 *   Expected Output:
 *     CS210+CS211+CS212: Olivia
 *     CS210+CS211 NOT CS212: Eva
 */

import java.util.HashSet;

public class Quiz5 {

    public static void main (String[] args) {

        HashSet<String> CS210 = new HashSet<>();
        HashSet<String> CS211 = new HashSet<>();
        HashSet<String> CS212 = new HashSet<>();

        HashSet<String> temp = new HashSet<>();
        HashSet<String> temp2 = new HashSet<>();
        HashSet<String> temp3 = new HashSet<>();

        CS210.add("Bill");
        CS210.add("Eva");
        CS210.add("Olivia");

        CS211.add("Eva");
        CS211.add("Olivia");
        CS211.add("Kim");

        CS212.add("Chloe");
        CS212.add("Jane");
        CS212.add("Olivia");
        CS212.add("Kim");

        temp = (HashSet) CS210.clone();
        temp.retainAll(CS211);
        temp.retainAll(CS212);

        temp2 = (HashSet) CS210.clone();
        temp2.retainAll(CS211);
        temp2.removeAll(CS212);

        temp3 = (HashSet) CS210.clone();
        temp3.addAll(CS211);
        temp3.addAll(CS212);


        System.out.println("CS210+CS211+CS212: " + temp);
        System.out.println("CS210+CS211 NOT CS212: " + temp2);
        System.out.println("At least one class: " + temp3);

    }

    public static void atLeastOneClass() {

    }
}
