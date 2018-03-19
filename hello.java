// a simple program to practice common Github commands 
import java.util.Scanner;
public class hello {

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = reader.nextLine();
        reader.close();


        System.out.println("Hello " + s + ", my name is Billy!");



    }
}

