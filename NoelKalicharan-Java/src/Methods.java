
public class Methods {
	
	public static void swap(int list[],int i, int j){
		int temp =list[i];
		list[i]=list[j];
		list[j]=temp;
	}
	
	public static int getSmallestFromList(int list[], int lowIndex, int highIndex){
		int smallestElement=lowIndex;
		
		for (int h = lowIndex+1; h < highIndex; h++) {
			if(list[h]<list[smallestElement])
				smallestElement=h;			
		}
		
		return smallestElement;
	}
	public static void selectionSort(int[] listToSort, int lowIndex, int highIndex){
		for (int h = lowIndex; h < highIndex; h++) {
			int tempSmallest = getSmallestFromList(listToSort, h, highIndex);
			swap(listToSort, h, tempSmallest);
		}	
	
	}

}
