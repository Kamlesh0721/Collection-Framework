package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
//        try {
//            FileReader fr = new FileReader("D:\\Hustle\\Java 2\\src\\FileHandling\\FileWrite\\DemoFile3.txt");
//            int c = fr.read();
//            while (c != -1) {
//                System.out.print((char) c);
//                c= fr.read();
//            }
//            fr.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            BufferedReader fr = new BufferedReader(new FileReader("D:\\Hustle\\Java 2\\src\\FileHandling\\FileWrite\\DemoFile3.txt"));
//            String line;
//            while ((line = fr.readLine()) != null) {
//                System.out.println(line);
//            }
//            fr.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        try {
            File f = new File("D:\\Hustle\\Java 2\\src\\FileHandling\\FileWrite\\DemoFile3.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
