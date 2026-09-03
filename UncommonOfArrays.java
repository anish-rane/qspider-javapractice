package arrays;
//print all the uncommon elemnts of both arrays
public class UncommonOfArrays {
	public static void uncommon(int[] arr1,int[] arr2) {
		boolean flag = false;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					flag = true;
					break;
				}
			}
			if(flag==false) {
				System.out.println(arr1[i]);
			}
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i]==arr2[j]) {
					flag = true;
					break;
				}
			}
			if(flag==false) {
				System.out.println(arr2[i]);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {4, 5, 6, 7, 8};
		uncommon(arr1, arr2);
	}
}
