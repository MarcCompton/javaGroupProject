//Ralph

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RiskFactors{
    public static void main(String[] args) {
        try {
            File file1 = new File("RiskFactors.txt");
            Scanner sc = new Scanner(file1);
            while(sc.hasNextLine()){
                    System.out.println(sc.nextLine());
            }
        
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while reading: " + e);
        }
    }

}