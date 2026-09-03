package arrays;

public class CombineArrays {
	public static int[] combine(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int[] result = new int[n1+n2];
		for (int i = 0; i < n1; i++) {
			result[i] = arr1[i];
		}
		for (int i = 0; i < n2; i++) {
			result[n1+i] = arr2[i];
		}
		
		return result;
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {6, 7, 8, 9, 10};
		int[] combined = combine(arr1, arr2);
		System.out.print("Combined elements: ");
		for (int i = 0; i < combined.length; i++) {
			System.out.print(combined[i] + " ");
		}
	}

}
