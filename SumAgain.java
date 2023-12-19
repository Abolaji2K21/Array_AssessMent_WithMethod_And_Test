import java.util.Scanner;
import java.util.Arrays;

	public class SumAgain{
		public static void main(String... args){

			Scanner input = new Scanner(System.in);
		System.out.print("Oya Mr Chi Ask For The Total Sum Oya Let Show Him");

			int[] array;
			array = new int[10];
			int count = 0;
			int array_Index;
			int largest = 0;
			
			
			System.out.println();
			for(int collect = 0; collect < array.length ; collect++){
			System.out.print("Oya Go Ahead : " );
			array[collect]= input.nextInt();
			if (array[collect] == -1){break;}
			array_Index = collect;
			count += array[collect];

			if (array[collect] > largest ){
					largest = array[collect];
				}


		}

				for (int index = 0; index < array.length; index++){
							System.out.println();
				System.out.print("The Sum Of :"  + array[index]);
				}
				System.out.println();
				System.out.println(count);
				System.out.println();
				System.out.println("The Largest Num Is :" + largest);

 
	
	
	}

}




/*sequence 
selection 
iteration */
