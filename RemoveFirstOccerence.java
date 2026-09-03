package arrays;

import java.util.Arrays;

public class RemoveFirstOccerence {
	public static int[] removeFirstOccerence(int[] arr,int key) {
		int n=arr.length;
		int count=1;
		int[] res=new int[n-1];
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==key && count==1) {
				count--;
				continue;
			}
			res[j]=arr[i];
			j++;
		}
		
		return res;
		
	}
	public static void main(String[] args) {
		int arr[]= {10,20,10,30,10,40};
		int k=10;
		int[] res=removeFirstOccerence(arr, k);
		System.out.println(Arrays.toString(res));


	}

}
