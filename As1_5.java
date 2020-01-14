// Author: Khalid Hassan
import java.util.Scanner;

class As1_5
{

    public static void main(String[] args){
        Scanner iStream = new Scanner(System.in);

        String s1, s2;

        System.out.print("Enter a string: ");
        s1 = iStream.next();

        System.out.print("Enter a string: ");

        s2 = iStream.next();        
        // s2 = s1;

        System.out.println("The value of == operator: " + (s1 == s2));
        System.out.println("The value of equals() operator: " + s1.equals(s2));
    }
}