import java.util.Scanner;

class IsPalindrome{
    public static void main (String args[]){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        //Get usrr input
        System.out.println("Enter a word");
        String word= myObj.nextLine();
        String n = word; 
        //Change all characters to lowercase
        n = n.toLowerCase();
        //set i  to equal the beginnnig of the string 
        int i=0;
        // set J to equal the last character in the string 
        int j=n.length()-1;
        // While I is less than J 
        while (i < j){
            //Check if I is equal to J
            if (n.charAt(i) != n.charAt(j)){
                System.out.println(word +" is not a plaindrome");
                // Increase i by 1
                i++;
                // Decrease j by 2 
                j--;
                //Break. Nothing further is needed if true 
                break;
            }
            //Else, the word must be a palindrome 
            else 
                System.out.println(word +" is a palindrome");
                //Nothing more is needed. Break to prevent infinite loop.
                break;

        }
    
    }
}
