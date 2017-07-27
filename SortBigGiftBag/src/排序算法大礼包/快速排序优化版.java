package 排序算法大礼包;

public class 快速排序优化版 {

	public void quickSort(int[] a,int n){
		int start=0;
		int end=n-1;
		sort(a,start,end);
	}
	
	public void sort(int[] a,int start,int end){
		if(start<end){
			int mid=a[end];
			int counter=start;
			for(int i=start;i<a.length;i++){
				if(a[i]<mid){
					swap(a,counter,i);
					counter++;
				}
			}
			swap(a,start,end);
			sort(a,start,counter-1);
			sort(a,counter+1,end);
		}
	}
	
	public boolean swap(int[] a,int num1,int num2){
		if(num1!=num2){
			int temp=num1;
			num1=num2;
			num2=temp;
			return true;
		}else{
			return false;
		}
	}
}
