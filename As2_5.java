import java.util.*;

class InvalidScoreException extends Exception{
    private int score;

    public InvalidScoreException(int score_p){
        score = score_p;
    }

    public String toString(){

        String a = "InvalidScoreExeption: [";

        if(score < 0){
            
            a += "Score can not be negetive.]";
        }

        else{
            a += "Score can not exceed 100.]";
        }

        return a;
    }

 }

class Student {
    private int roll;
    private String name;
    private int score;

    public Student(int roll_p, String name_p, int score_p) throws InvalidScoreException{

        roll = roll_p;
        name = new String(name_p);
        

        if(score_p < 0 || score_p > 100){
            throw new InvalidScoreException(score_p);
        }

        score = score_p;
    }

    public Student(int roll_p, String name_p){
        roll = roll_p;
        name = new String(name_p);
    }

    public Student(int roll_p){
        roll = roll_p;
        name = new String("Unknown");
    }


    public void setScore(int score_p) throws InvalidScoreException
    {
        if(score_p < 0 || score_p > 100) throw new InvalidScoreException(score_p);
        
        score = score_p;
    }


}

public class As2_5{

    public static void main(String args[]){

        Student a = new Student(19, "Khalid Hassan");

        try{
            a.setScore(101);
        }
        catch(InvalidScoreException e){

            System.out.println("Exception encountered\n" + e);
        }

        try{
            a.setScore(-100);
        }
        catch(InvalidScoreException e){

            System.out.println("Exception encountered\n" + e);
        }

    }
}
