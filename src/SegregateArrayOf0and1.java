import java.util.Arrays;

public class SegregateArrayOf0and1 {

	public static void segregateArray(int[] array) {

		int left = 0;
		int right = array.length - 1;

		while (left < right) {

			while (array[left] == 0 && left < right) {
				left++;
			}

			while (array[right] == 1 && left < right) {
				right--;
			}

			if (left < right) {
				array[left] = 0;
				array[right] = 1;
				left++;
				right--;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0 };
		segregateArray(array);
		System.out.println(Arrays.toString(array));
	}
}
