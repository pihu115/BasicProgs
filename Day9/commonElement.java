package Day9;

public class commonElement {

	public static void main(String[] args) {

    
		 int[] arr1 = {4,9,11,20,22,8};
	     int[] arr2 = {11,7,13,4,8,12,70};
         for(int i=0;i<arr1.length;i++){
	     for(int j=0;j<arr2.length;j++){
         if(arr1[i] == arr2[j]){
	     System.out.println(arr1[i]);
		}
		}
	}

	}

}
