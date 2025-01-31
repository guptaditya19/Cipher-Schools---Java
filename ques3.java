import java.io.PrintStream;
import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total cart amount: ");
        double totalCartAmount = scanner.nextDouble();
        scanner.close();
        double discount = (totalCartAmount > 5000) ? totalCartAmount * 0.20 :
                          (totalCartAmount >= 3000) ? totalCartAmount * 0.10 : 0.0;
        double finalAmount = totalCartAmount - discount;
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
    }
}
