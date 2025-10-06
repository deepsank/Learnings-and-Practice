package Learning.FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:- ");
        int n = sc.nextInt();
        System.out.println("Enter each student's name, roll number,age, marks in Maths, Science and English:-");
//        for (int i = 0; i <n ; i++) {
//            String name = sc.next();
//            int roll = sc.nextInt();
//            int age = sc.nextInt();
//            int maths = sc.nextInt();
//            int science = sc.nextInt();
//            int english = sc.nextInt();
//            System.out.println(name+" "+roll+" "+age+" "+maths+" "+science+" "+english);
//        }
        List<String> report = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the student +"+i+1+"'s details:-");
            System.out.println("Name:- ");
            sc.nextLine(); // consume leftover newline , sometimes sc.nextLine() skips input if used after nextInt() or nextFloat()
            String name  = sc.nextLine();
            System.out.println("Roll Number:- ");
            int rollNo = sc.nextInt();
            System.out.println("Age:- ");
            int age = sc.nextInt();
            System.out.println("Enter the marks in Maths, Science and English:-");
            int maths = sc.nextInt();
            int science = sc.nextInt();
            int english = sc.nextInt();
            int total = maths + science + english;
            double avg = total / 3.0;
            String grade = getGrade(avg);
            String result = String.format("Name: %s, RollNo: %d,Age: %d,Maths: %d,Science: %d,English: %d, Total: %d, Average: %.2f, Grade: %s",name,rollNo,age,maths,science,english,total,avg,grade);
            System.out.println(result);
            report.add(result);

        }

        writoFile(report);
        System.out.println("\n📄 Report saved to report_card.txt");

        sc.close();
    }

    private static String getGrade(double avg) {
        if (avg >= 85) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 50) return "C";
        else return "F";
    }

    private static void writoFile(List<String> report) {

        try{
            PrintWriter pw = new PrintWriter(new FileWriter("report_card.txt"));
            for (String s : report) {
                pw.println(s);
            }
            pw.close();
        }
        catch (IOException e){
            System.out.println("Error in writing to file");
        }
    }
}
