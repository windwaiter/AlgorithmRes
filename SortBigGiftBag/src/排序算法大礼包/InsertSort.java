package 排序算法大礼包;
/**
 * 
 * @author Ty
 *
 *插入排序时间复杂度为O（n2）
 */
public class InsertSort {
	public int[] insertionSort(int[] A, int n) {
        int i, j, temp;
        for(i = 1; i < n; i++){
            temp = A[i];
            for(j = i; j > 0 && A[j - 1] > temp; j-- ){
                A[j] = A[j - 1];
            }
            A[j] = temp;
        }
        return A;
    }
}
