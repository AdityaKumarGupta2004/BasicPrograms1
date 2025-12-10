import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * filesample
 */
public class filesample {

    public static void main(String[] args) {
        // creating a new File
        /*
         * File file1 = new File("FileFirstSample.txt");
         * try {
         * file1.createNewFile();
         * } catch (Exception e) {
         * // TODO: handle exception
         * System.out.println("File Cannot be  created ");
         * e.printStackTrace();
         * 
         * 
         * }
         */
//writing into the file
        /*
         * try {
         * FileWriter fileWriter= new FileWriter("FileFirstSample.txt");
         * fileWriter.write("This is our First file in java\nok now bye ");
         * fileWriter.close();
         * } catch (Exception e) {
         * System.out.println("Unable tto write in a file ");
         * 
         * e.printStackTrace();
         * }
         */
//reading from a file
        // File myfile = new File("FileFirstSample.txt");
        // try {
        //     Scanner sc = new Scanner(myfile);
        //     while (sc.hasNextLine()) {
        //         String line = sc.nextLine();
        //         System.out.println(line);

        //     }
        //     sc.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }
        //deleting a file
        // File myfile = new File("FileFirstSample.txt");
        // if(myfile.delete())
        // {
        //     System.out.println("I have Deletd my file"+myfile.getName());

        // }
        // else
        // {
        //     System.out.println("Some error occured while deleting a file");
        // }

    }
}