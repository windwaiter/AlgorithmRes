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

}
