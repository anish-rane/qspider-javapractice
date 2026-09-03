package arrays;

import java.util.Arrays;
//removing key form arrays
public class RemoveDuplicate {
	public static int[] remove(int[] arr,int key) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		int[] res=new int[arr.length-count];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=key) {
				res[j]=arr[i];
				j++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,10,30,10,40};
		int k=10;
		int[] res=remove(arr, k);
		System.out.println(Arrays.toString(res));
	}
}
