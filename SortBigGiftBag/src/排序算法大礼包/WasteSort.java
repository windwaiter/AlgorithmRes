package 排序算法大礼包;
/**
 * 
 * @author Ty
 *
 *不知道什么排序算法，时间复杂度O（n2），空间复杂度O（n2）
 */
public class WasteSort {
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
