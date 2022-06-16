import java.util.Scanner;

public class ReverseString {
    public static void main (String args[]){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        //Get user input
        System.out.println("Enter a word");
        String word= myObj.nextLine();
        myObj.close();

        //Create somewhere to store the reversed string
        String revword= "";
        //Create a variable to holde each letter 
        char letter;
        //Create a counter
        int i;
        //Change all inputs to lowercase
        word = word.toLowerCase();
        //Loop through the string: Init I = 0; While I is less than string length; Increment I value 
        for (i=0; i < word.length(); i++){
            //pull the first letter of the input string 
            letter = word.charAt(i);
            //ReversedWord takes each first letter, adds it to the string and loops again. First letter becomes last letter
           revword = letter+revword;
       
        }
        //Output reversed word 
        System.out.println("Reversed word: "+ revword);
        //FOR FUN: Palindrome Check
        //If word equals reversed word: is a palindrome, else, is not
        //Had to use .equals() instead == because == checks to see if both strings are the same object  
        if (word.equals(revword)){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");

        }

    }
    
}
