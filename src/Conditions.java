
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anisoaraavram
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a new city
        City kw = new City();
        
        //Create a robot
        Robot karel = new Robot (kw, 1, 1, Direction.EAST);
        
        //put up a wall
        new Wall (kw, 1, 5, Direction.EAST);
        
        //creating a thing
        new Thing (kw, 0, 1);
        new Thing (kw, 0, 1);
        new Thing (kw, 0, 1);
        new Thing (kw, 0, 1);
        new Thing (kw, 0, 1);
        new Thing (kw, 0, 1);
        
        //an infinite loop; asking karel if it was free to move
        while(karel.frontIsClear()){
            
            //move and turn left
            karel.move();
            //karel.turnLeft();
            
            //if there is something to pick up
            if(karel.canPickThing()){
                
                //pick up everything
                karel.pickThing();
                
                //stop the loop after it picks up one thing
                break;
            }
            
            //did karel hit a wall
            //! says to do the opposite; the 'not' symbol
            if(!(karel.frontIsClear() )){
                karel.turnLeft();
            
                
            }
        }
        
    }
    
}
