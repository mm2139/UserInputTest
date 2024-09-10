import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How much was your online purchase?");

        double purchasePrice = scan.nextDouble();

        double totalPrice = purchasePrice*1.05 + 2.99; //5% tax and 2.99 shipping

        System.out.println("Your  total, including tax and shipping, is " + totalPrice);

        }
    }
