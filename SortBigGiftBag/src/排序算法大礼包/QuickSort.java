package 排序算法大礼包;

/**
 * 
 * @author Ty
 *快速排序
 */
public class QuickSort {
	public void quickSort(int[] a){
		int left=0;
		int right=a.length-1;
		//对于数组进行分割
		divisionArray(a,left,right);
	}

	private void divisionArray(int[] a, int left, int right) {
		int mid=0;
		if(left<right){
			mid=sort(a,left,right);
			
			divisionArray(a, left, mid-1);
			divisionArray(a, mid+1, right);
		}
	}
	
	private int sort(int[] a, int left, int right) {
		int key=a[left];
		int i=left;
		int j=right;
		if(left<right){
			while(i<j){
				while(i<j&&key<=a[j]){
					j--;
				}
				if(i<j){
					a[i]=a[j];
				}
				while(i<j&&a[i]<=key){
					i++;
				}
				if(i<j){
					a[j]=a[i];
				}
			}
			a[i]=key;
		}
		return i;
	}
}
