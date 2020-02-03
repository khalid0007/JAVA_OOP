import java.util.Scanner;

class Metric{
    private static double milesPerKm = 1.5;

    public static double toMile(double km){
        return km*milesPerKm;
    }

    public static double toKm(double mile){
        return mile/milesPerKm;
    }
}

public class As1_10{

    public static void main(String[] args){

        Scanner iSteam = new Scanner(System.in);

        double miles, km;

        System.out.println("Enter mile value to convert into kms: ");
        miles = Scanner.nextDouble;

        System.out.println(miles + " = " + Metric.toKm(miles));
    }
}
