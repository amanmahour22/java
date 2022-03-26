import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class inputuser {
    public static void main(String[] args){
        Scanner aman = new Scanner(System.in);

        System.out.println("Enter number a : ");
        int a;
        a = aman.nextInt();
        System.out.println("Enter number b : ");
        int b;
        b = aman.nextInt();
        int sum = a + b;

        System.out.print("The sum of these number is : ");
        System.out.println(sum);
    }    
}
