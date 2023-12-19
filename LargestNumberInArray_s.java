
		public class LargestNumberInArray_s{


		public static void LargestNumberIn_Array(int[] array){
				int largest_Num = 0;

			for(int collect = 0; collect < array.length; collect++){
			System.out.println();


				if (array[collect] > largest_Num ){
					largest_Num = array[collect];

				}
					System.out.println(largest_Num);

			}


		}

	}


/*javac -cp "junit-platform-console-standalone-1.10.0.jar;." LargestNumberInArray_sTest.java
java -jar junit-platform-console-standalone-1.10.0.jar --classpath . --scan-classpath --include-classname LargestNumberInArray_sTest*/
