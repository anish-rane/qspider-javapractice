package arrays;

import java.util.Arrays;

public class LeftRotate {
	public static int[] leftRotate(int[] arr,int d) {
		int n=arr.length;
		int[] res=new int[n];
		for(int i=0;i<n;i++) {
			res[i]=arr[(i+d)%n];
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int d=2;
		int[] res=leftRotate(arr, d);
		System.out.println(Arrays.toString(res));

	}

}
