package com.knoldus.Question2;

import java.util.Random;
import java.util.Scanner;
public class RandomNumber
{
    public static void main(String args[])
    {
        Scanner takeInput = new Scanner(System.in);
        Random randomNumber = new Random();
        int random = randomNumber.nextInt(1, 100);
        System.out.println("Enter a number: ");
        int userInput=0;
        while(userInput != random)
        {
            try
            {
                userInput = Integer.parseInt(takeInput.next());
                if (userInput < random)
                {
                    System.out.println("Too Low");

                }
                else if (userInput > random)
                {
                    System.out.println("Too High");

                }
                else
                {
                    System.out.println("You guessed it!");
                }
            }
            catch (NumberFormatException exception)
            {
                System.out.println("Invalid Input, Please enter a valid number");
            }
        }
    }
}
