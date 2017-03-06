
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anisoaraavram
 */
public class ExampleofA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.in means by typing 
        Scanner input = new Scanner(System.in);
        
        //make sure that the user knows what to do
        //First rule as a programmer to let the user know what to do
        System.out.println("Please enter your name");
        
        //different sting variable
        //getting the Scanner to support the keyboard for the user's input
        String name2 = input.nextLine();
                
        //string stores the name 'mr.lamont'
        //a string stores the name.
        //String name = "Mr. Lamont";
                
        //anything you put into the brackets will come out. 
        //the + name put the stored string and imports it into the saying
        System.out.println("Hello " + name2);
        
        //Blinking curser for the bottom means to type something in
        //and it inputs the line (spaces doesn't matter) and it scans everyhting
        
        //ask the user what year they were born
        //use this to calculate their age
        //short cut to do System.out.print(); is = sout :then hit tab:
        System.out.println("What year were you born");
        
        //puting in a counter to do the calculation
        int year = input.nextInt();
        
        //determinating their age
        int age = 2017 - year;
        
        // to gaurd aginst people who put their age above the year
        if (age > 0) {
            
        //to add more text you put a + then add the "" to add addintional text
        System.out.println("You are " + age + " years old");
        }else{
            //inputs that their are lying
            System.out.println("I think you are lying");
        }
        
        // + add
        // - Subtracting
        // * Mulitply
        // / Divide
        // % remainder (modulus
        // you can do 10*(1+3) however you have to tell it to do it. No short cuts.
        // To make the computer to be more pasific is to add 9.0; The .0 adds the decimal
        // 5%2 shows the remainder. It tell you what's left over. The answer is 1.
    }

}
