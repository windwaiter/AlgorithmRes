package �����㷨�����;

/**
 * 
 * @author Ty
 *ԭ��֮ǰд�������˷��������ѡ������
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
	
	//��һ�������ҵ����ֵ
	public void choiceMax(int[] a){
		int length=a.length;
		int location=a[0];
		for(int i=0;i<length;i++){
			if(location<=a[i]){
			  location=a[i];
			}
		}
	}
	
	//��һ�������ҵ���Сֵ
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
