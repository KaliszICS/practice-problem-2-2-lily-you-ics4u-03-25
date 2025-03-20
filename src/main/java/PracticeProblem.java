import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
	}
	
	public static int[] compareSearch(int[] array, int number){
		Arrays.sort(array);
		int seqCount = 0;
		for(int i = 0; i < array.length; i++){
			seqCount++;
			if(array[i] == number){
				i = array.length;
			}
		}
		int mid;
		int low = 0;
		int binCount = 0;
		int high = array.length - 1;
		while(low <= high){
			binCount++;
			mid = (high + low)/2;
			if(number == array[mid]){
				low = high + 1;
			}
			else if(number > array[mid]){
				low = mid + 1;
			}
			else{
				high = mid -1;
			}
		}
		return new int[]{seqCount, binCount};
	}
	public static int[] compareStringSearch(String[] array, String word){
		Arrays.sort(array);
		int seqCount = 0;
		for(int i = 0; i < array.length; i++){
			seqCount++;
			if(array[i].equals(word)){
				i = array.length;
			}
		}
		int mid;
		int low = 0;
		int binCount = 0;
		int high = array.length - 1;
		while(low <= high){
			binCount ++;
			mid = (high + low)/2;
			if(array[mid].equals(word)){
				low = high + 1;
			}
			else if(word.compareTo(array[mid]) > 0){
				low = mid + 1;
			}
			else{
				high = mid -1;
			}
		}
		return new int[]{seqCount, binCount};
	}

}