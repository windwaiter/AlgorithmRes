package 排序算法大礼包;
/**
 * 
 * @author Ty
 *
 */
public class 堆排序 {
	public void heapSort(int[] a,int n){
		for(int i=n/2;i>0;i--){
			heapAdjust(a,i,n);
		}
		
		 for(int i=n-1;i>0;i--){
	            swap(a,0,i);
	            heapAdjust(a,0,i);
	        }
	}
	
	private void heapAdjust(int[] a, int index, int length) {
		int childleft=0;
		int temp=a[index];
		for(;index*2+1<length;index=childleft){
			childleft=index*2+1;
			if(childleft<length-1&&a[childleft]<a[childleft+1]){
				childleft++;
			}
			if(temp>a[childleft]){
				break;
			}else{
				a[index]=a[childleft];
				index=childleft;
			}
		}
		a[index]=temp;
	}

	public void swap(int a[],int num1,int num2){
		int temp=a[num1];
		a[num1]=a[num2];
		a[num2]=temp;
	}
	
	public static void main(String args[]){
		堆排序 堆排序=new 堆排序();
		int[] a=new int[]{2,2,2,1,1,1,0};
		堆排序.heapSort(a, a.length);
		for(int i:a){
			System.out.println(i);
		}
	}
}
