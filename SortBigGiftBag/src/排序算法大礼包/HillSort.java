package 排序算法大礼包;
/**
 * 
 * @author Ty
 *现在不怕写算法了，感觉水平还是有了提高，不知不觉算法水平就提高了
 *数组a，n是所需要的步长
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
