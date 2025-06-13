import java.util.Scanner;
public class FactorialFor {
    public static void main(String...rgs) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), factorial = 1;
        if (num >= 0) {
            for (int i = 1; i <= num; i++)
                factorial *= i;
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Invalid input");
        }
    }
}
