// Author: Khalid Hassan
import java.util.Scanner;

class As1_4
{
    private final static float PI = 3.14F;

    public static void main(String[] args){
        Scanner iStream = new Scanner(System.in);

        System.out.print("Enter radius value: ");
        float radius = iStream.nextFloat(), area;

        area = PI*radius*radius;

        System.out.println("Area of circle: " + area);
    }
}