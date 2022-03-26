import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class percentage {
    public static void main (String[] args){
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Subject 1 marks : ");
        float a = sc.nextFloat();
        System.out.println("Enter Subject 2 marks : ");
        float b = sc.nextFloat();
        System.out.println("Enter Subject 3 marks : ");
        float c = sc.nextFloat();
        System.out.println("Enter Subject 4 marks : ");
        float d = sc.nextFloat();
        System.out.println("Enter Subject 5 marks : ");
        float e = sc.nextFloat();

        float percentage = (a+b+c+d+e)/5f;

        System.out.println("The percentage of these marks is :" + percentage);
    }  
}
