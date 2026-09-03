package arrays;

import java.util.Arrays;
import java.util.Scanner;
//Rotate the arrays n times
public class RightRotateN {
	public static void rightRotateN(int[] arr,int r) {
		int n=arr.length;
		
		for(int i=0;i<r;i++) {
			int last=arr[n-1];
			for(int j=n-1;j>=0;j--) {
				if(j==0) {
					arr[j]=last;
				}else {
					arr[j]=arr[j-1];
				}
			}
			
		}
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int r=sc.nextInt();
		rightRotateN(arr,r);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
