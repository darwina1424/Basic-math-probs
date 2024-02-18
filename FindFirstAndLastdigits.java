import java.util.Scanner;
public class FindFirstAndLastdigits{
    //function to find first digit
    public static int firstdigit(int n) {
        while (n > 10) {
            n /= 10;
        }
        return n;
    }
    //function to find last digit
    public static int lastdigit(int n){
       return n%10;
    }
    //main method
    public static void main(String[]args){
       Scanner s1=new Scanner(System.in);
       System.out.print("enter the number=");
       int n=s1.nextInt();
        System.out.println("First digit is " + firstdigit(n) + " and last digit is " + lastdigit(n));
    }
}

