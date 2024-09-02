import java.util.Arrays;

public class ParallelSortingExemplo {

	public static void main(String[] args) {
		
		int[] meu_array = {5, 8, 1, 0, 6, 9, 50, -3};
		
		for(int i : meu_array) {
			System.out.print(i + " ");
		}
		
		/*****************************************************/
		
		Arrays.parallelSort(meu_array, 0, 5);
		
		System.out.println();
		
		for(int i : meu_array) {
			System.out.print(i + " ");
		}

	}

}
