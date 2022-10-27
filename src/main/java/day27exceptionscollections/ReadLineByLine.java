package day27exceptionscollections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {

    public static void main(String[] args) {

        readLineByLine();
    }

    public static void readLineByLine(){

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/day26exceptions/File01.txt"));
            String line = reader.readLine();

            while (line!=null){
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("There is an issue about the path or about the file. ");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
