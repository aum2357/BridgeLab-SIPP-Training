import java.util.Scanner;
import java.time.Year;
class Age{

public static void main(String... args){
	Scanner sc = new Scanner(System.in);

	int currentYear = Year.now().getValue();
	System.out.print("Enter your birthyear:");
	int birthYear = sc.nextInt();

	System.out.println("Your current age is: "+ (currentYear - birthYear));


}


}
