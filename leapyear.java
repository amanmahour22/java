import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
/*    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter your no. ");
    int n = sc.nextInt(); 
    boolean A = false; 
    for (int i = 2; i <= Math.sqrt(n); ++i) { 
        // condition for nonprime number 
        if (n % i == 0) { 
            A = true; break;
        } } 
    if (!A) System.out.println("Yes"); 
    else System.out.println("No"); 
*/
    Scanner scanner = new Scanner(System.in);
    //Storing the captured value in a variable
    int n = scanner.nextInt();
    LeapYear(n);   
}
static void LeapYear(int year){
 if (((n % 4 == 0) && (n % 100 !=0) || (n % 400 == 0)){
     System.out.println("Yes");
 }
 else{
     System.out.println("No");
 }
} 
}