
public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a1= {1,2,3,4,5};
        int[] a2= {9,8,6,4,5};
        for(int i=0;i<a1.length;i++) {
        	for(int j=0;j<a2.length;j++) {
        		if(a1[i]==a2[j]) {
        			System.out.print(a1[i]+" ");
        			
        		}
        	}
        }
        
		
	}

}
