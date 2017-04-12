
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
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creating a scanner for user input
        Scanner input = new Scanner(System.in);

        //create a list of 5 numbers
        double[] marks = new double[5];

        //scan in some marks
        System.out.println("Please enter in five marks.");

//        //"Dum way to do this \/" (Bad Way)
//        //put a number in the first position
//        marks[0] = input.nextDouble();
//        //put a number in the second position
//        marks[1] = input.nextDouble();
//        //so on and so forth...
        //Better way to do this - FOR LOOPS!
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        //"dum" way to do this
//        double average = marks [0] + marks [1] + etc.;
        //use a for lopp to determin the sum
        //start with an accumulator
        double sum = 0;
        
        //for loop to go through each number
        for (int i = 0; i < marks.length; i++) {
            //add whatever number I'm on to the sum
            sum = sum + marks[i];
        }
        
        System.out.println("");
        System.out.println("The sum is " + sum + ".");
        
        //calculate average
        double avg = sum/marks.length;
        System.out.println("The average is " + avg + ".");
        
        //outprinting the marks
        System.out.println("");
        System.out.println("The numbers in your array is");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            
        }
        
        //Extra - enchanced for loop
        for (double num:marks){
            System.out.println(num);
        }
    }

}
