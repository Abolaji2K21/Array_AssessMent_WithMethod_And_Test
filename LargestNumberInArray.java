import java.util.Scanner;
import java.util.Arrays;
	public class LargestNumberInArray{

		public static void main(String... args){

		Scanner input = new Scanner(System.in);
		System.out.println( " I WILL BE HELPING YOU CHOOSE CORRECTLY THE LARGEST INPUT FROM YOUR CHOICE OF THREE INTEGERS : " );
		System.out.println();



		int[] array;
		array = new int[3];	
		
		System.out.println("The Highest Number Amongst All Three Choice From User Input is thus : " + LargestNumberIn_Array(array, input));


		}



		public static int LargestNumberIn_Array(int[] array, Scanner input){
				int largest_Num = 0;

			for(int collect = 0; collect < array.length; collect++){
		System.out.println();
		System.out.print( " OYA BOSS SHARPLY ENTER ANY INTEGER  : "  );

			array[collect] = input.nextInt(); 
				if (array[collect] > largest_Num ){
					largest_Num = array[collect];
				}
			}
			return largest_Num ;


		}
	}