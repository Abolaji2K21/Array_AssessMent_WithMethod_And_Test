import java.util.Scanner;
	import java.util.Arrays;

	public class TakesAndReturn{
		public static void main(String... args){
		
			Scanner input = new Scanner(System.in);
	System.out.println(" I Will Be Helping You With Returning Your Almight Numbers to Digits Ex: 2342 Converted To [2,3,4,2]");
	System.out.println();		
			
			System.out.print(" Enter A Number Consisting Of Three Integers: ");
			char [] array;
			array = new char[3];

			TakesAndReturn_s(array, input);
			}

		public static void TakesAndReturn_s(char[] array, Scanner input){
        		String number = input.next(); 
			for(int collect = 0; collect < array.length ; collect++){
			array[collect] = number.charAt(collect);

			}
	System.out.println();		
       			 System.out.println(" Here Is The Divided Digits " + Arrays.toString(array));

		}	

	}