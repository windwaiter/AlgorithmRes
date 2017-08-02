package 排序算法大礼包;
/**
 * 
 * @author Ty
 *
 *归并排序
 */
public class GuibingSort {
	public void guibingSort(int[] a){
		int left=0;
		int right=a.length-1;
		
		changeArray(a,left,right);
	}
	
	public void changeArray(int[] a, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			// 利用递归，将数组分割
			changeArray(a, left, mid);
			changeArray(a, mid + 1, right);
			sort(a, left, mid, right);
		}
	}
	
	private void sort(int[] a, int left, int mid, int right) {
		int[] array=new int[right-left+1];
		//左游标
		int leftIndex=left;
		//右游标
		int rightIndex=mid+1;
		//临时数组游标
		int tempIndex=0;
		while(leftIndex<=mid&&rightIndex<=right){
			if(a[leftIndex]<a[rightIndex]){
				array[tempIndex++]=a[leftIndex++];
			}else{
				array[tempIndex++]=a[rightIndex++];
			}
		}
		//剩余的放入
		while(leftIndex<=rightIndex){
		    array[tempIndex++]=a[leftIndex++];
		}
		//剩余的放入
		while(rightIndex<=right){
			array[tempIndex++]=a[rightIndex++];
		}
		//临时数组放入原数组
		int temp=0;
		while((left+right)<=right){
			a[left+right]=array[temp];
			temp++;
		}
		
	}

	public static void main(String args[]){
		int[] a=new int[]{5,8,10,7,6};
		GuibingSort guibingSort=new GuibingSort();
		guibingSort.guibingSort(a);
		for(int i:a){
			System.out.print(i);
		}
	}
}
