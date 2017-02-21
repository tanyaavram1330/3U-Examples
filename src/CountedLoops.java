
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anisoaraavram
 */
public class CountedLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Primitive; int, long, short, double, float, char, boolean
        //Primitive is like the most basic thing I've got (indiviual things)
        //Prinitive have lower case letters, Primitives don't have commands

        //Objects;Robot, City, Wall, Thing
        //Combinging Primitives together creates objects. Built off of Primitives
        //Objects have capital letters, Objects have commands
        // Oddball; Sting (To store in commands or words)  
        // Create city
        City kw = new City();

        //create a robot
        //It can turn right if you add SE, move to a pace, and turn in circles
        //SE means 'special edition'
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST);

        //make a counter
        int counter = 0;
        //moce 5 times using the condition
        while (counter < 5) {
            karel.move();
            //increase the counter!
            counter = counter + 1;
            //short cut to add= counter++; To subtract= counter--;
            //counter += 1; means that you can add that amount of number each time

        }

        karel.turnAround();

        //for (define a variable; condition to loop; increase/change variable)
        //using a for loop to count
        for (int i = 0; i < 5; i++) {
            karel.move();
        }

        //compound conditions
        //&& <- is an AND statment - Both must be true
        // || <- OR statement - one of them mut be true
        if (karel.frontIsClear()) {
            if (karel.countThingsInBackpack() == 5) //do something
            {

            }
        }
        if (karel.frontIsClear() && karel.countThingsInBackpack() == 5) {

        }

        if (karel.frontIsClear()) {
            //do something
        } else if (karel.countThingsInBackpack() == 5) {
            //do same thing as above

        }

        if (karel.frontIsClear() || karel.countThingsInBackpack() == 5) {
            //do something
        }

    }

}
