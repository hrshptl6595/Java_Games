/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthepassword;
import javax.swing.*;
/**
 *
 * @author harsh
 */
public class GuessThePassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //This string will hold the user's input
        String input;
        //Take input now
        input=JOptionPane.showInputDialog("Enter the secret Message.");
        //test for correctness, "Evil Genius" is the secret message
        if(input.equals("Evil Genius"))//if user is correct
        {
            //Print winning message
            System.out.println("You got the correct message");
        }
        //if user is wrong
        else
        {
            //print loosing message
            System.out.println("LOSER!! You are wrong!! HaHaHa....");
        }
    }
    
}
