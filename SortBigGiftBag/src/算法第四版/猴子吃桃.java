package �㷨���İ�;

public class ���ӳ��� {
	public static int f(int days) {
		//��֪��������뻹���Ը���̵���
		return (days == 1) ? 1 : 2 * (f(days - 1) + 1);
		// if(days==1){
		// return 1;
		// }else{
		// return 2*(f(days-1)+1);
		// }
	}
}
