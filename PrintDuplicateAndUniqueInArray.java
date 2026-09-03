package arrays;
//print all unique element and all duplicate elements of an giveen array

public class PrintDuplicateAndUniqueInArray {
	public static void countDuplicate(int[] arr) {
		int count = 0;
		System.out.println("Duplicate elements in the array are: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					count++;
					break;
				}
			}
		}
		if (count == 0) {
			System.out.println("No duplicate elements found in the array.");
		}
		System.out.println();
		System.out.println("Unique elements in the array are: ");
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 1, 2 ,1,2};
		countDuplicate(arr);
//		System.out.println(res);

	}
}
