import java.util.*;
public class ArrayExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int di[]=new int[5];
       Scanner scr=new Scanner(System.in);
       int n=scr.nextInt();
       
       
       for(int i=0;i<n;i++) {
    	   di[i]=scr.nextInt();
    	   
       }
       for(int i=0;i<n;i++) {
    	   System.out.print(di[i]+" ");
       }
	}

}
