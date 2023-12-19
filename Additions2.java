import java.util.Scanner;
	public class Additions2{

		public static void main(String... bj){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int userInput = 0;
		 

			while(count++ < 5){
		System.out.println("ENTER NUMBER ");
		userInput = input.nextInt();
		sum += userInput;

				}
System.out.println("The Sum Of All " + sum);

			}
	}