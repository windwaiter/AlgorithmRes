package �㷨���İ�;

public class ����ת�������� {
	public String changeBinary(int num){
		String s="";
		for(int n=num;n>0;n/=2){
			s=(n%2)+s;
		}
		return s;
	}
}
