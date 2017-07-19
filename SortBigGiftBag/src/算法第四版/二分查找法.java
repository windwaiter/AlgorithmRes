package �㷨���İ�;

public class ���ֲ��ҷ� {

	public int twoSelect(int[] a, int n) {
		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (n < a[mid]) {
				right = mid - 1;
			} else if (n > a[mid]) {
				left = mid + 1;
			} else {
				return mid + 1;
			}
		}
		return -1;
	}
}
