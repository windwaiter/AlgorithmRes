package 算法第四版;

public class 整数转化二进制 {
	public String changeBinary(int num){
		String s="";
		for(int n=num;n>0;n/=2){
			s=(n%2)+s;
		}
		return s;
	}
}
