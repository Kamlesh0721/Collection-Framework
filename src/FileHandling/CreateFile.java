package FileHandling;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) {

        //  Method 1-The File class in Java can be used to create a file using the createNewFile() method.
//        File f = new File("D:\\Hustle\\Java 2\\src\\FileHandling\\Files\\DemoFile.txt");
//        try {
//            if (f.createNewFile()) {
//                System.out.println("File Created ..." );
//            }else{
//                System.out.println("Error occurred while creating file ...");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Method 2- FileOutputStream can be used to create a file and write data to it.
        // It throws exception so it need to be handled
//        try {
//            FileOutputStream f2 = new FileOutputStream("D:\\Hustle\\Java 2\\src\\FileHandling\\Files\\DemoFile1.txt");
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        //  Method 3- PrintWriter can be used to create a file and write formatted text to it.
//        try {
//            PrintWriter f3 = new PrintWriter("D:\\Hustle\\Java 2\\src\\FileHandling\\Files\\DemoFile2.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Method 4- BufferedWriter can be used for efficient writing of characters to a file.
        try {
            BufferedWriter f4 = new BufferedWriter(new FileWriter("D:\\Hustle\\Java 2\\src\\FileHandling\\Files\\DemoFile3.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
