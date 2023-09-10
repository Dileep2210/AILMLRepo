import java.util.*;
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {1,9,4,6,1};
		
		int max=a1[0];
		int min=a1[0];
		for(int j=0;j<a1.length;j++) {
			if(max<a1[j]) {
				max=a1[j];
			}
			
		}
	System.out.println("maximum value is"+max);
	
	for(int j=0;j<a1.length;j++) {
		if(min>a1[j]) {
			min=a1[j];
		}
		
	}
	System.out.println("minumum value"+min);
	}

}
