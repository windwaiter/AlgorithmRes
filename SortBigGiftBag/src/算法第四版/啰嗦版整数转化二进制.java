package 算法第四版;

public class 啰嗦版整数转化二进制 {
	public String molimojiChangeTwo(int n){
		StringBuffer s =new StringBuffer();
		while(n/2!=0||n==1){
			if(n%2==0){
				s.append("0");
				n=n/2;
			}else{
				s.append("1");
				n=n/2;
			}
			if(n==1){
				s.append("1");
				n=0;
			}
		}
		return s.reverse().toString();
	}
	public static void main(String[] args){
		啰嗦版整数转化二进制 t=new 啰嗦版整数转化二进制();
		System.out.println(t.molimojiChangeTwo(10));
	}
}
