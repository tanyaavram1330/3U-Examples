
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avrat1330
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a new city called kitchener
        
        City kitchener = new City();
        
        //Creating a wall
        new Wall (kitchener, 1, 1, Direction.WEST);
        new Wall (kitchener, 1, 2, Direction.EAST);
        new Wall (kitchener, 1, 1, Direction.NORTH);
        new Wall (kitchener, 1, 2, Direction.NORTH);
        
        //creating a robot
        Robot bob  = new Robot (kitchener, 2, 1, Direction.NORTH);
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        
        
        
    }
}
