import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scannerObj.nextLine();
    
        System.out.println("Your name is "+name);
    }
}