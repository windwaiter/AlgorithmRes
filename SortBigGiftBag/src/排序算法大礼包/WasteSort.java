package �����㷨�����;
/**
 * 
 * @author Ty
 *
 *��֪��ʲô�����㷨��ʱ�临�Ӷ�O��n2�����ռ临�Ӷ�O��n2��
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
