package 算法第四版;
/**
 * 
 * @author Ty
 *求两个数的最大公约数
 */
public class 欧几里得 {
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
