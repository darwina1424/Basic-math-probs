import java.util.Scanner;
public class OddOrEven {
    public static boolean isEven(int n) {//function for finding odd or even
        return (n % 2 == 0);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = scanner.nextInt(); // Read the input number
        if(isEven(n))  {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        scanner.close(); // Close the scanner after usage
    }
}
