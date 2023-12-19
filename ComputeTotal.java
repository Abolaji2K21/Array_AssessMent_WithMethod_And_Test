import java.util.Scanner;
import java.util.Arrays;

	public class ComputeTotal{
		public static void main(String... args){

		Scanner input = new Scanner(System.in);
	System.out.println("Enter Any Three Digit To So I Can Help You Compute The Sum ");

		int[] array = new int[3];
		System.out.println(" Also The Running Total Of Your Array_List = " + computeTotals(array, input));

		}

		      public static int computeTotals(int[] array, Scanner input){
			int count = 0;
			int array_Index;
			System.out.println();
			for(int collect = 0; collect < array.length ; collect++){
			System.out.print("Oya Go Ahead : " );
			array[collect]= input.nextInt();
			array_Index = collect;
			count += array[collect];
			System.out.println(" The Cummulative Total In The array_Index " + array_Index  + " Is " + count );
			}
			System.out.println();
			return count;
		
		    }
	        }