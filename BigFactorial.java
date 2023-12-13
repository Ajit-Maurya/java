import java.math.BigInteger;
import java.util.Scanner;
public class BigFactorial{
	public static void main(String args[]){
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger ans = new BigInteger("1");
		for(int i = 2; i<=n; i++){
			ans = ans.multiply(BigInteger.valueOf(i));
		}
		System.out.println(ans);
	}
}
// String name = sc.nextLine();
 
//         // Character input
//         char gender = sc.next().charAt(0);
 
//         // Numerical data input
//         // byte, short and float can be read
//         // using similar-named functions.
//         int age = sc.nextInt();
//         long mobileNo = sc.nextLong();
//         double cgpa = sc.nextDouble();