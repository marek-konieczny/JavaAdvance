import java.util.Scanner;


public class SelectionSortDrive extends Methods{
	final static int NumbersToSort = 10;
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int[] listToSort = new int[NumbersToSort];
		System.out.printf("Type max %d numbers and finish data input typing 0\n", NumbersToSort);
		int indexCounter = 0;
		int currentInput = userInput.nextInt();
		
		while(currentInput!= 0 && indexCounter<NumbersToSort){
			listToSort[indexCounter++]=currentInput;
			currentInput = userInput.nextInt();
		}
		if (currentInput!=0) {
			System.out.printf("\nTyped more than %d numbers.", NumbersToSort);
			System.out.printf("\nOnly %d numbers will be used.", NumbersToSort);	
		}
		if (indexCounter==0) {
			System.out.printf("\nNo numbers typed");
			System.exit(1);
		}
		
		selectionSort(listToSort, 0, indexCounter);
		System.out.printf("\nNumbers after sort algorithm:\n");
		for (int i = 0; i < indexCounter; i++) {
			System.out.printf("%d ", listToSort[i]);			
		}
		System.out.printf("\n");
		
		

	}

}
