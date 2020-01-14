// Author: Khalid Hassan
import java.util.Scanner;

class As1_2
{
    public static void main(String[] args){

        System.out.println("Number of command line argument passed: " + args.length);

        for(int i = 0; i < args.length; i++) System.out.println((i + 1) + "> " + args[i]);
    }
}