import  java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter your number");
        Scanner scannerObj = new Scanner(System.in);
        int firstnumber = scannerObj.nextInt();
        
        System.out.println("Enter your next number");
        Scanner scannerObjs = new Scanner(System.in);
        int secondnumber = scannerObjs.nextInt();

        System.out.println(firstnumber*secondnumber);

    

    }

}