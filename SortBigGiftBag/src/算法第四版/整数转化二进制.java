package 算法第四版;

public class 整数转化二进制 {
	public String changeBinary(int num){
		String s="";
		for(;num>0;num/=2){
			s=(num%2)+s;
		}
		return s;
	}
}
