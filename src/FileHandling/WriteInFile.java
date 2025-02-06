package FileHandling;

import java.io.*;

public class WriteInFile {
    public static void main(String[] args) {
        // Method 1-
//        FileWriter is a basic class used to write character data to a file. You can either append data to an existing file or overwrite it.
//        try {
//            FileWriter writer = new FileWriter("D:\\Hustle\\Java 2\\src\\FileHandling\\FileWrite\\DemoFile.txt");
//            writer.write("Hi ");
//            writer.close();
//            System.out.println("Sucessfully written in file");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // Append to file - true is passed as 2nd parameter to append in file using FileWriter
//        try {
//            FileWriter writer = new FileWriter("D:\\Hustle\\Java 2\\src\\FileHandling\\FileWrite\\DemoFile.txt",true);
//            writer.write("Bye");
//            writer.close();
//            System.out.println("successful");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Method 2 -BufferedWriter provides efficient writing by buffering characters, useful when writing large amounts of data.
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Hustle\\Java 2\\src\\FileHandling\\FileWrite\\DemoFile2.txt"));
            writer.write("Hello");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Method 3 - PrintWriter allows you to write formatted text to a file, making it a flexible option.
//        try {
//            PrintWriter writer = new PrintWriter(new FileWriter("D:\\Hustle\\Java 2\\src\\FileHandling\\FileWrite\\DemoFile3.txt"));
//            writer.write("Hello");
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Method - 4-FileOutputStream is used to write raw bytes to a file. It's useful for writing binary data or text data converted to bytes.

        try {
            FileOutputStream fos = new FileOutputStream("D:\\Hustle\\Java 2\\src\\FileHandling\\FileWrite\\DemoFile4.txt");
            String data = "Hello";
//            fos.write("Hello".getBytes());
            fos.write(data.getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
