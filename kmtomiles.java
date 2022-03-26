import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class kmtomiles {
    public static void main(String[] args){
        double kilometers;
        System.out.print("Please enter kilometers : ");
        Scanner sc = new Scanner(System.in);
        kilometers = sc.nextDouble();

        double miles = kilometers/1.6;
        System.out.println("miles : " + miles);
    }
}
