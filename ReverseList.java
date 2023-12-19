import java.util.Scanner;
import java.util.Arrays;

	public class ReverseList{
		public static void main(String... args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Any Integer Of Your Choice So I Can Help You With The Reverse ");
		System.out.println();


		int[] array;
		array = new int[3];
		
		ReverseList_s(array, input);
		}
		

		public static void ReverseList_s(int[] array, Scanner input){
			for(int collect = 0; collect < array.length ; collect++){
			System.out.print("Oya Boss Enter The Integer You Will Like To Reverse : " );
			array[collect] = input.nextInt();
			}
		int[] reverse;
		reverse = new int[3];
		int count = 0;

		for(int collect = array.length - 1; collect >= 0; collect--){
				reverse[count] = array[collect];
			count++;

		  }
			System.out.println();
		System.out.println("Your Reverse Integer is thus : " + Arrays.toString(reverse));
		
		}
	
	}