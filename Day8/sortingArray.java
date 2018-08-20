package Day8;

import java.util.Arrays;

public class sortingArray {

	public static void main(String[] args) {
		int arr[] = {40,6,20,100,60,60};
		
		System.out.println("before sort :"+(arr));
		
		Arrays.sort(arr);
		System.out.println("after sorting :"+Arrays.toString(arr));
	}

}
