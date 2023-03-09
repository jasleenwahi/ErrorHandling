 package com.knoldus.Question1;
import java.util.Scanner;
class DivisionByZeroException extends Exception
{
    DivisionByZeroException(String message)
    {
        super(message);
    }
}
public class Calculator
{
    public static int add(int number1, int number2)
    {
        int sum = number1+number2;
        return sum;
    }
    public static int subtract(int number1, int number2)
    {
        int difference = number1-number2;
        return difference;
    }
    public static int multiply(int number1, int number2)
    {
        int product = number1*number2;
        return product;
    }
    public static int divide(int number1, int number2) throws DivisionByZeroException {
        int quotient;
        if(number2 == 0)
        {
            throw new DivisionByZeroException("Division by zero is not possible");
        }
        else
        {
            quotient = number1/number2;
        }

        return quotient;
    }


}

class Main
{
    public static void main(String args[])
    {
        int number1=0;
        int number2=0;
        int additionResult;
        int subtractionResult;
        int multiplicationResult;
        int divisionResult;
        Scanner takeInput = new Scanner(System.in);

        try
        {
            System.out.println("Enter the first number: ");
            number1 = Integer.parseInt(takeInput.next());
            System.out.println("Enter the second number: ");
            number2 = Integer.parseInt(takeInput.next());
            additionResult=Calculator.add(number1,number2);
            subtractionResult = Calculator.subtract(number1, number2);
            multiplicationResult = Calculator.multiply(number1,number2);
            System.out.println("The sum of two numbers is: "+additionResult);
            System.out.println("The difference of two numbers is: "+subtractionResult);
            System.out.println("The product of two numbers is: "+multiplicationResult);
            divisionResult = Calculator.divide(number1,number2);
            System.out.println("The quotient of two numbers is "+divisionResult);
        }
        catch (DivisionByZeroException exception)
        {
            System.out.println(exception);

        }
        catch (NumberFormatException exception)
        {
            System.out.println("the input is not  valid number");
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Arithmetic exception occurred");
        }
    }
}