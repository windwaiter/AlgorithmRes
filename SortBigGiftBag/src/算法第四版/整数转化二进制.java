package �㷨���İ�;

public class ����ת�������� {
	public String changeBinary(int num){
		String s="";
		for(;num>0;num/=2){
			s=(num%2)+s;
		}
		return s;
	}
}
