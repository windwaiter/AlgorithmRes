package �����㷨�����;
/**
 * 
 * @author Ty
 *
 *��������ʱ�临�Ӷ�ΪO��n2��
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
