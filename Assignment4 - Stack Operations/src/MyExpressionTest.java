/* Mario Rodriguez, CS 211
 * 980384835
 * November 22, 2021;
 * Bellevue College
 * MyExpressionTest -
 * Description:
 *
 */

import java.util.Scanner;

public class MyExpressionTest {

    public static void main (String[] args) {

        String mathExpression; //used for user input
        String postfixExpression; //used to store postfix expression
        double postfixEvaluation = 0;

        Scanner input = new Scanner(System.in); //scanner obj to receive input

        ExpressionEvaluation ee = new ExpressionEvaluation(); //expression evaluation ojb
        InfixToPostfix infixToPost = new InfixToPostfix(); //infix to post fix translator
        PostfixEvaluation expressionEvaluation = new PostfixEvaluation(); //postfix evaluator

        boolean isMathExpression = true;
        boolean keepGoing = true;

        do {

            System.out.print("Enter a math expression: ");

            mathExpression = input.nextLine();

            isMathExpression = ee.expressionEvaluation(mathExpression);

            if(isMathExpression) {
                postfixExpression = infixToPost.infixToPostfixExpression(mathExpression);
                postfixEvaluation = expressionEvaluation.postfixEvaluation(postfixExpression);
            }


            if (mathExpression.equals("0")) {
                keepGoing = false;
            }

            System.out.println(postfixEvaluation);

        } while (keepGoing);

    }

}
