import java.util.Scanner;

public class fibonacci {
    public static void main (String args[]){
        //Scanner myObj = new Scanner(System.in); 
        int i = 0;
        int j = 1;
        int z = 0;
        int start = 0;
        int count= 45;
        System.out.print(i+", "+j);

        for(start = 0; start < count; start ++ ){
            z = i + j;
            System.out.print(", "+z);
            i=j;
            j=z;

        }

}
}