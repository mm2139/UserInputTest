import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userNum;

        System.out.print("Hello! What is your number?");
        userNum = scan.nextInt();

        if (userNum%2 == 0) {
            System.out.println("Your number is EVEN");
        } else {
            System.out.println("Your number is ODD");
        }
    }
}