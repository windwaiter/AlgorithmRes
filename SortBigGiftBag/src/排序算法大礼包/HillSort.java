package �����㷨�����;
/**
 * 
 * @author Ty
 *���ڲ���д�㷨�ˣ��о�ˮƽ����������ߣ���֪�����㷨ˮƽ�������
 *����a��n������Ҫ�Ĳ���
 *
 */
public class HillSort {

	public void hillsort(int[] a,int n){
		int len=a.length-1;
		for(int i=0;i<=len-n;i++){
			if(a[i]>a[i+n]){
				int location=a[i];
				a[i]=a[i+n];
				a[i+n]=location;
			}
		}
		if(n>1){
			hillsort(a,n-1);
		}else if(n==1){
			
		}
	}
	public static void main(String args[]){
		int[] a=new int[]{8,53,132,65436,123165,735,23,1345,4};
		HillSort hillsort=new HillSort();
		hillsort.hillsort(a, 3);
		for(int n:a){
			System.out.println(n);
		}
	}
}
