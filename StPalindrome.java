import java.util.Scanner;
import java.util.Arrays;

	public class StPalindrome{
		public static void main(String... args){
		
		Scanner input = new Scanner(System.in);
	System.out.println("Oya My Fans I Will Be Helping You With Word Palindrome Check");
        System.out.print("Enter a word: ");

			String [] array;
			array = new String[1];

			
			StPalindrome_s(array, input);

			}

		public static void StPalindrome_s(String[] array, Scanner input){
		for(int collect = 0; collect< array.length; collect++){
			array[collect]= input.next();
			 
			}

		String reverse = "";

		for(int collect = array[0].length() - 1; collect>=0; collect--){
            		reverse = reverse + array[0].charAt(collect);

		}


			 if (array[0].equalsIgnoreCase(reverse)) {
			System.out.println();
            		System.out.println("it is a palindrome");
       			 } else {
          		System.out.println("it is not a palindrome");
        		}
	    }

	}