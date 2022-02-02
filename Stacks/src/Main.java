/* Mario Rodriguez, CS 211
 * 980384835
 * May 27, 2021
 * Bellevue College
 * Stack211 Calculator -
 * Description:
 * This program takes in simple mathematical expressions and evaluates them.  The underlying data structure
 * used is a Stack Queue with additional HashMap data structures to support processing
 *
 */

import java.util.*;

public class Main {

    static HashMap<Integer, String> errorMessage = new HashMap<>();
    static HashMap<Character, Character> pair = new HashMap<>();
    static HashMap<Character, Integer> precedence = new HashMap<>();

    static String[] Statement = {"( 1 + 3 )"};


    public static void main (String[] args) {

        //initializes the error methods and pairs
        loadErrorMessages();
        loadPair();
        //initializes the precedence
        setPrecedence();

        //Expression Evaluation
        for (int i = 1; i < Statement.length; i++) { //traversal of the tokens in the statement string array

            String expression = Statement[i]; //creates variable for the first token in the statement
            Stack211<Character> st = new Stack211<>(); //creates stack from generic stack class
            boolean correct = true; //sets boolean flag for evaluation of token
            String post = "";

            for (int j = 0; j < expression.length() && correct; j++) { //traversal for chars in token

                char c = expression.charAt(j);

                if ( c == '(' || c == '{') {
                    st.push(c); //push the char to the stack
                    post += c;
                }

                if (c >= '0' && c <= '9') {
                    post += c;
                }

                if (c == '+' || c == '-' || c == '*' || c == '/') {
                    post += c;
                }

                if ( c == ')' || c == '}') {

                    correct = testBrackets(c, j, st);

                    if (!correct) {
                        if (c == ')') {
                            System.out.print(post);
                            printError(j, 1);
                        } else if (c == '}') {
                            System.out.print(post);
                            printError(j, 3);
                        } else {
                            break;
                        }
                    }

                }
            }
        }
    }

    public static Boolean testBrackets(char ch, int j, Stack211<Character> st) {

        char popC = st.pop();

        if (!st.isEmpty()) {
            return false;
        }else if (popC != ch) {
            return false;
        } else {
            return true;
        }
    }

    public static String infixToPostfix(Stack211<Character> str) {

        String post = "";
        Stack211<Character> st = new Stack211<>();

        for (int i = 0; i < Statement.length; i++) {

            for (int j = 0; j < Statement[i].length(); j++) {

                char c = Statement[i].charAt(j);

                if (c >= '0' && c<= '9') {
                    post += c;
                }

                if ( c == '(' || c == '{') {
                    st.push(c);
                }

                if ( c == ')') {
                    char popC = st.pop();
                    if (popC != pair.get(c)) {
                        printError(j, 1);
                    }
                }

                if (c == '}') {
                    char popC = st.pop();
                    if (popC != pair.get(c)) {
                        printError(j, 2);
                    }
                }
            }
        }
        return "string";
    }

    public static void postFixEvaluation(String str) {
        System.out.println(str);
    }

    public static void loadErrorMessages() {
        setErrorMessage();
    }

    public static void setErrorMessage() {
        errorMessage.put(1, "Syntax Error: ) expected");
        errorMessage.put(2, "Syntax Error: ( expected");
        errorMessage.put(3, "Syntax Error: } expected");
        errorMessage.put(4, "Syntax Error: { expected");
    }

    public static void loadPair() {
        setPair();
    }

    public static void setPair() {
        pair.put(')', '(');
        pair.put('}', '{');
        pair.put('(', ')');
        pair.put('{', '}');
    }

    public static void setPrecedence() {

        precedence.put('*', 2);
        precedence.put('/', 2);
        precedence.put('+', 1);
        precedence.put('-', 1);

    }

    public static void printError(int location, int errorNo) {
        for (int i = 0; i < location; i++) {
            System.out.print(" ");
        }

        System.out.println("^");

        System.out.println(errorMessage.get(errorNo));
    }

}
