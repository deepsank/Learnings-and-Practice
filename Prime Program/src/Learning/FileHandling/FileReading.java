package Learning.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
           sc=   new Scanner(new File("report_card.txt"));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        sc.close();
    }

}
