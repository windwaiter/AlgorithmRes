package �㷨���İ�;
/**
 * 
 * @author Ty
 *�������������Լ��
 */
public class ŷ����� {
	public int oJLD(int q,int p){
		if(q==0){
			return p; 
		}else
		if(q%p==0){
			return p;
		}else
		{
			int r=q%p;
			return oJLD(q, r);
		}
		
	}
}
