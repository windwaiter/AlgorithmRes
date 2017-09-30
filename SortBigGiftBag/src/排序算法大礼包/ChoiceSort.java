package 排序算法大礼包;

/**
 * 
 * @author Ty
 *原来之前写出来的浪费排序就是选择排序
 */
public class ChoiceSort {
	
	public void wasterSort(int[] arry){
		for(int i=0;i<arry.length;i++){
			for(int j=i;j<arry.length;j++){
				if(arry[i]>arry[j]){
					int location=arry[i];
					arry[i]=arry[j];
					arry[j]=location;
				}
			}
		}
	}
	
	//在一列数中找到最大值
	public void choiceMax(int[] a){
		int length=a.length;
		int location=a[0];
		for(int i=0;i<length;i++){
			if(location<=a[i]){
			  location=a[i];
			}
		}
	}
	
	//在一列数中找到最小值
	public void choiceMin(int[] a){
		int length=a.length;
		int location=a[0];
		for(int i=0;i<length;i++){
			if(location>=a[i]){
			  location=a[i];
			}
		}
	}
}
