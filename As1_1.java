// Author: Khalid Hassan
import java.util.Scanner;

class As1_1
{
    public static void main(String[] args){
        Scanner iStream = new Scanner(System.in);
        short a, b;
        int sum;

        System.out.print("Enter two short integer: ");
        a = iStream.nextShort();
        b = iStream.nextShort();

        sum = a + b;

        System.out.println("Sum of two sort interger is " + sum);
    }
}