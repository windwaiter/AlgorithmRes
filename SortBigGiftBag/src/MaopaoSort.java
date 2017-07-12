import java.util.Arrays;

/**
 * 
 * @author Ty
 *
 *√∞≈›≈≈–Ú£¨ ±º‰o£®n2£©£¨ø’º‰∏¥‘”∂»o(n2)
 */
public class MaopaoSort {
	public static void maopaoSort(int[] arry){
		for(int i=0;i<arry.length;i++){
			for(int j=0;j<arry.length-i-1;j++){
				if(arry[j]>arry[j+1]){
					int location=arry[j+1];
					arry[j+1]=arry[j];
					arry[j]=location;
				}
			}
		}
	
	}

}
