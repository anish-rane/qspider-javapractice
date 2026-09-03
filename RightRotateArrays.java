package arrays;

import java.util.Arrays;
//Rotate arrays by 1
public class RightRotateArrays {
	public static void rightRotate(int[] arr) {
		int n=arr.length; 
		int last=arr[n-1];
		for(int i=n-1;i>=0;i--) {
			if(i==0) {
				arr[i]=last;
			}else {
				arr[i]=arr[i-1];
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		rightRotate(arr);
		System.out.println(Arrays.toString(arr));
	}
}

