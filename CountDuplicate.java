package arrays;

public class CountDuplicate {
	public static int countDuplicate(int[] arr) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 1, 2 ,1,2};
		int res = countDuplicate(arr);
		System.out.println(res);

	}

}
