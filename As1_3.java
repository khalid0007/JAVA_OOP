// Author: Khalid Hassan
import java.util.Scanner;

class As1_3
{
    public static void main(String[] args){
        Scanner iStream = new Scanner(System.in);

        int height;
        System.out.print("Enter height value in cm: ");
        height = iStream.nextInt();

        final float cmPerInch = 2.54F, cmPerFoot = 30.5F;

        System.out.println("Height in inches " + (height/cmPerInch));
        System.out.println("Height in feet " + (height/cmPerFoot));
    }
}