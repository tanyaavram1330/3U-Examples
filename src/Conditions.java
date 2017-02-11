
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
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
        
        
        
        //An infinite loop
        while(karel.frontIsClear()){
            karel.move();
            karel.turnLeft();
            while(karel.canPickThing()){
                
           
            }
        }
        
    }
    
}
