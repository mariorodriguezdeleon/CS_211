/* Mario Rodriguez, CS 211
 * 980384835
 * November 22, 2021;
 * Bellevue College
 * ExpressionEvaluation-
 * Description:
 *
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExpressionEvaluation {

    private static String token;
    private static final String SPECIAL_CHARACTERS = "()+-*/^";

    static HashMap<Integer, String> errorMessage = new HashMap<>();
    static HashMap<Character, Character> pairs = new HashMap<>();
    static HashMap<Character, Integer> precedence = new HashMap<>();
    static Stack<Character> stack = new Stack<>();

    //Load error messages
    static {
        errorMessage.put(1, " } expected");
        errorMessage.put(2, " ) expected");
        errorMessage.put(3, "Incomplete Expression");
    }
    //Load pairs
    static {
        pairs.put('(', ')');
        pairs.put(')', '(');
        pairs.put('{', '}');
        pairs.put('}', '{');
    }
    //Load precedence
    static {
        precedence.put('*', 2);
        precedence.put('/', 2);
        precedence.put('+', 1);
        precedence.put('-', 1);
    }

    public static boolean expressionEvaluation(String mathExpression) {

        boolean isMathExpression = true;
        String expression = "";

        for (int i = 0; i < mathExpression.length(); i++) {

            boolean flag = Character.isDigit(mathExpression.charAt(i)); //check to see if char is number

            if(flag) {

                char c = mathExpression.charAt(i);

                if (c == '(' || c == '{') {
                    stack.push(c);
                } else {
                    isMathExpression = false;
                }

            }

        }

//        findNextToken();
        System.out.println(stack);
        return isMathExpression;

    }

}
