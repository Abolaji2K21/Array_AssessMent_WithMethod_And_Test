import java.util.Scanner;
import java.util.Arrays;


	public class EvenPositions{

		public static void main(String... args){

		Scanner input = new Scanner(System.in);
	System.out.println(" An Array Showing List Of Element In Even Positons ");
	System.out.println();


		int[] array = {2, 4, 5, 7, 0, 1};
	
		
		EvenPosition_s(array);
		}


		  		public static void EvenPosition_s(int[] array){

			for(int collect = 0; collect < array.length ; collect++){
				if (collect % 2 == 0){
					System.out.print(" Index = " + collect);
				System.out.println(" Values = " + array[collect]);


				}

			}
		

	
		}

}