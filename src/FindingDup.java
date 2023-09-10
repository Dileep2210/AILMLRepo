
public class FindingDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ad[]= {1,5,8,2,3,1,5,6,5,6,3,2,1};
		System.out.println("Dupliclates elements are:");
		
		for(int i=0;i<ad.length;i++) {
			for(int j=i+1;j<ad.length;j++) {
				if (ad[i]==ad[j]){
					System.out.print(ad[j]+" ");
				}
			}
		}
		

	}

}
