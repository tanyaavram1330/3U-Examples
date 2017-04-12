
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
public class StringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        while (true) {
            //get a word from the user
            System.out.println("Please enter in a word.");
            String word = input.nextLine();

            //converting to lowercase
            //converts the upercase to lowercase
            word = word.toLowerCase();

            //fix 1337 (leet) speak
            //word.replace [changes the number to the letter]
            word = word.replace("3", "e");
            //change a;; @ to a
            word = word.replace("@", "a");
            //changing all 0 to o
            word = word.replace("0", "o");

            //seeing how long the string is
            int length = word.length();
            System.out.println("That's word's length is " + length);

            //gets the letter at a position
            //word.charAt(length -1) [this gets the last letter of the word]
            char letter = word.charAt(0);
            System.out.println("Character at 0 is " + letter);

            //print out each letter in the word
            //start at position 0, and go up to length - 1 [same as length - 1]
            for (int i = 0; i < length; i++) {
                //get the character at posistion i
                char character = word.charAt(i);

                //print out the characters
                System.out.println(character);

                //see if it is a vowel
                // || is an 'or' && is an 'and'
                if (character == 'a' || character == 'e' || character == 'i'
                        || character == '0' || character == 'u') {

                    //breaking up the sting where the vowel was found
                    String firstHalf = word.substring(0, i);
                    String lastHalf = word.substring(i);

                    //create the translated word
                    String tWord = lastHalf + firstHalf + "ay";

                    //trying to find a postion of an 'a', if not found it'll give you -1
                    int aPosition = word.indexOf("a");

                    //show the uer pig Latin
                    System.out.println("Your word in Pig Latin is " + tWord);

                    //stopping the program when END is entered
                    if (word.equals("END")) {
                        //stop looking for more vowels!
                        break;
                    }
                }
            }

        }
    }

}
