/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbercruncher;
import javax.swing.*;
/**
 *
 * @author harsh
 */
public class NumberCruncher {

    /**
     * @param args the command line arguments
     */
    //throwing exception for Thread.sleep()
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
        //generate random numbers for the equation
        int num1 = (int)(Math.round(Math.random()*10));
        int num2 = (int)(Math.round(Math.random()*10));
        //random number for the sign
        int sign = (int)(Math.round(Math.random()*3));
        //variable for answer
        int answer;
        //Make stuff noticeable
        System.out.println("\n\n*****");
        
        if(sign == 0)
        {
            //tell user and calculate answer
            System.out.println(num1+" * "+num2);
            answer = num1*num2;
        }
        else if(sign == 1)
        {
            //tell user and calculate answer
            System.out.println(num1+" / "+num2);
            answer = num1/num2;
        }
        else if(sign == 2)
        {
            //tell user and calculate answer
            System.out.println(num1+" + "+num2);
            answer = num1+num2;
        }
        else if(sign == 3)
        {
            //tell user and calculate answer
            System.out.println(num1+" - "+num2);
            answer = num1-num2;
        }
        else
        {
            //tell user and calculate answer
            System.out.println(num1+" % "+num2);
            answer = num1%num2;
        }
        //make it easir to read
        System.out.println("*****\n");
        //count down from 3
        System.out.println("3...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        
        //print the answer
        System.out.println("Answer = "+answer);
    }
    
}
