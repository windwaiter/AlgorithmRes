package 排序算法大礼包;
/**
 * 
 * @author Ty
 *
 *插入排序时间复杂度为O（n2）
 */
public class InsertSort {
	public void insertSort(int[] a){
		int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=temp;j>0;j++){
				if(a[temp]<a[i+1]){
					temp=i+1;
				}else{
					int location=a[j];
					a[j]=a[i+1];
					a[i+1]=location;
				}
			}
		}
	}
	public static void main(String[] args){
		int[] a=new int[]{5,2,1,4,6};
		InsertSort insertSort=new InsertSort();
		insertSort.insertSort(a);
		for(int i:a){
			System.out.println(i);
		}
	}
}
