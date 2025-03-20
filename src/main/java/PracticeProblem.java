import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
		int seqCount = compareSearch(new int[]{1,7,8,9,5}, 9);
		System.out.println(seqCount);
	}
	
	public static int compareSearch(int[] array, int number){
		Arrays.sort(array);
		int seqCount = 0;
		while(array[seqCount] != number && seqCount < array.length-1){
			seqCount++;
		}
		return seqCount;
	}
}