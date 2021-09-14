package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class App
{
    public static void main( String[] args )
    {
        int order_amount;
        String state;
        int t;
        int n;
        double investment_amount;
        int flag=0;
        Scanner input=new Scanner(System.in);

        System.out.print("What is the order amount? ");
        order_amount=input.nextInt();


        System.out.print("What is the state? ");
        state=input.next();

        String Final="The total is $"+(order_amount)+".";

        if(state.equals("WI"))
        {
            double order_amount_tax=order_amount*.055;
            BigDecimal cent_rounding = new BigDecimal(order_amount_tax).setScale(2, RoundingMode.HALF_UP);
            double amount_rounded = cent_rounding.doubleValue();
            Final=("The subtotal is $"+(order_amount)+".\n"+"The tax is $"+(order_amount_tax)+".\n"+"The total is $"+(order_amount+amount_rounded)+".");
            flag=1;
        }

        System.out.print(Final);

    }
}

