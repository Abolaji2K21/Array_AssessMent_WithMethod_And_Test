import java.util.Scanner;
import java.util.Arrays;

	public class OddPositions{

		public static void main(String... args){
		
		Scanner input = new Scanner(System.in);
	System.out.println(" An Array Showing List Of Element In Odd Positons ");
	System.out.println();

		int[] array ;
		array = new int[6];

			OddPosition_s(array, input);
		}

		public static void OddPosition_s(int[] array, Scanner input){
			for(int collect = 0; collect < array.length ; collect++){
			System.out.print(" Enter Any Element Of Your Choice : ");
				array[collect] = input.nextInt();
				}
			for(int collect = 0; collect <= array.length ; collect++){
				if (collect % 2 != 0){
		System.out.print(" Index  Of Number Is : " +  collect );
		System.out.println("  Element of the Array : " + array[collect]);

				}
	

			}
		}
	}