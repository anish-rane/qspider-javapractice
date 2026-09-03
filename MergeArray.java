package arrays;

import java.util.Arrays;

public class MergeArray {
	public static int[] merge(int[] arr1, int[] arr2) {
		int n1=arr1.length;
		int n2=arr2.length;
		int n=n1+n2;
		int res[]= new int[n];
		int k=0;
		for(int i=0;i<n1;i++) {
			res[k]=arr1[i];
			k++;
		}
		for(int i=0;i<n2;i++) {
			res[k]=arr2[i];
			k++;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,20};
		int[] arr2= {30,40,50};
		int res[]=merge(arr1, arr2);
		System.out.println(Arrays.toString(res));

	}

}
