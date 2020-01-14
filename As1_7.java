// Author: Khalid Hassan
import java.util.Scanner;

class Student{
    private String name;
    private int roll;
    private int score;

    public Student(String nameStudent, int rollStudent, int scoreStudent){
        name = new String(nameStudent);
        roll = rollStudent;
        score = scoreStudent;
    }

    public Student(Student studentArg){
        name = new String(studentArg.name);
        roll = studentArg.roll;
        score = studentArg.score;
    }

    public void setName(String nameStudent){
        name = new String(nameStudent);
    }

    public void setRoll(int rollStudent){
        roll = rollStudent;
    }

    public void setScore(int scoreStudent){
        score = scoreStudent;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Score: " + score);
    }
}

public class As1_7
{    
    public static void main(String[] args){
        Scanner iStream = new Scanner(System.in);
        
        String n;
        System.out.print("Enter name of the stduent: ");
        n = iStream.nextLine();

        Student s = new Student();

        s.setName(n);
        s.setRoll(19);
        s.setScore(100);

        s.display();
    }
}