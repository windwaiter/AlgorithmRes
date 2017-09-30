
package ÅÅĞòËã·¨´óÀñ°ü;

public class countSort {


	
	    public int[] countingSort(int[] a, int n) {

	        int min=0;
	        int max=0;
	        for(int i=0;i<n;i++){
	           if(max<a[i]){
	               max=a[i];
	           }else if(min>a[i]){
	               min=a[i];
	           }
	        }
	        int[] arry=new int[max-min+1];
	        for(int i=0;i<n;i++){
	            arry[a[i]-min]++;
	        }
	        
	        int index=0;
	        for(int i=0;i<arry.length;i++){
	            while((arry[i]--)>0){
	                arry[index++]=i+min;
	            }
	        }
	        
	        return arry;
	    }
	
	public static void coutingSort(int[] a,int n){
		
		int min=0;
		int max=0;
		
		for(int i=0;i<a.length;i++){
			max=Math.max(a[i], max);
			min=Math.min(a[i], min);
		}
		
		int[] coutattr=new int[max-min+1];
		for(int i=0;i<a.length;i++){
			coutattr[a[i]-min]++;
		}
		
		int index=0;
		
		for(int i=0;i<coutattr.length;i++){
			while(coutattr[i]-->0){
				a[index++]=i+min;
			}
		}
		
	}
	
	public static void main(String args[]){
		int[] a=new int[]{-1,3,2,5,1,8,12,10};
		coutingSort(a,a.length);
		for(int m:a){
			System.out.println(m);
		}
	}
}
