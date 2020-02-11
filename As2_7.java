import java.util.*;

public class As2_7{

    public static void main(String args[]){

        Scanner iStream = new Scanner(System.in);

        String a = iStream.nextLine();

        System.out.println("String a starts with 'The': " + a.startsWith("The"));

        int cnt = 0;

        for(int i = 0; i < a.length(); i++) 
            if(a.charAt(i) == 'a') cnt++;

        System.out.println("Occurence of 'a' in string: " + cnt);

        cnt = 0;
        
        for(int i = 0; i < a.length() - 2; i++){
            if(a.regionMatches(i, "and", 0, 3)) cnt++;
        }

        System.out.println("Occurence of 'and' in string: " + cnt);

        char charArray[] = a.toCharArray();

        // a.getChars(0, a.length(), charArray, 0);

        System.out.println(charArray);

        String tokens[] = a.split("[@\\s.]");

        for(Object i: tokens){
            System.out.println(i);
        }
    }

}
