/*
Method Overloading
Class Calculator with method add().
Overload add() to add 2 numbers, 3 numbers, and double values.
 */
package OOPsPractise.Q9;

public class Calculator {
    double add(double num1, double num2){
        return num1+num2;
    }
    double add(double num1, double num2, double num3){
        return num1+num2+num3;
    }
}
