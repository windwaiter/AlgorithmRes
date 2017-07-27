package 算法第四版;

public class 猴子吃桃 {
	public static int f(int days) {
		//不知道这个代码还可以更简短点吗
		return (days == 1) ? 1 : 2 * (f(days - 1) + 1);
		// if(days==1){
		// return 1;
		// }else{
		// return 2*(f(days-1)+1);
		// }
	}
}
