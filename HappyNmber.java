package arrays;

import java.util.Scanner;

public class HappyNmber {
	public static boolean isHappy(int num) {
		while (num!=1&&num!=4) {
			int sum=0;
			while(num!=0) {
				int rem=num%10;
				sum+=rem*rem;
				num/=10;
			}
			num=sum;
		}
		return num==1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter number:");
		int n=sc.nextInt();
		boolean res=isHappy(n);
		System.out.println(res?"Happy numbrer":"not a Happy number");
		sc.close();
	}
}
