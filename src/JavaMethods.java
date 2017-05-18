/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anisoaraavram
 */
public class JavaMethods {

    /**
     * saying hello to a specified user
     */
    public static void sayHello() {
        System.out.println("Hello!");
    }

    /**
     * overloaded method.. has parameters. Same name. method to say hello part2
     *
     * @param name
     */
    public static void sayHello(String name) {
        System.out.println("Hello! " + name);
    }

    /**
     * Calculates the volume of the Cylinder
     *
     * @param radius the radius of the cylinder
     * @param height the height of the cylinder
     * @return the volume of the cylinder given radius and height
     */
    public static double volumeOfCylinder(double radius, double height) {

        //calculating the volume.
        double rSquared = Math.pow(radius, 2); // To do the power. Radius is in the base
        // and the 2 is in the power

        //doing the equation to get the volume of a cylinder
        double volume = Math.PI * rSquared * height;

        return volume; //send back the answer
    }

    /**
     * adding numbers together
     * @param num 
     */
    public static void addFive(int[] num){
        num[0] = num[0] +5;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //{ = This is called a method Header.
// '______'+
// access modifier
//         +
//  Static means that there is a shared project. 
//  Void = he is called the return type. *Important* Preform an action or send it. 
//  /\Not returning an answer. Change void ot something else. 'Double' for example
//  /\ will double the number at the end. You can send anything back unless it's void
// Int, Double, Char, Boolean, Int[] = The variable type the method will return
//  /\informetion with it.
// Main = name. Just give it a name
//(String[] args) = parameters. extra info needed for the method to work/run.
//  /\ multipule can be inputed by comas. ex. Double width, double height.
//Method body is the are between the brackets.

// String name/ variable
        String n = "Fred";

// calling the sayHello method
        sayHello();
        sayHello("Bob");
        sayHello(n);

        // doing the math equation. Radius= 10, height = 15 
        double answer = volumeOfCylinder(10, 15);
        //outputting the equation
        System.out.println(answer);
        
        //creating an equation to add various numbers together
        //You can't edit or change an primitive. Only objects.
        int[] num = {10, 15, 25};
        //creating a new string to store into a string to output later.
        addFive(num);
        //outputting the number that was added
        System.out.println(num[0]);
        
        //rounding the numbers
        double number = 27463.134487;
        number = Math.round(number);
        //outputting the numbers.
        System.out.println(number);
    }

}
