package tinhtong;



public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int s=0;
		
		for(int i=0;i<n;i++) {
			if((i%2)==0) {
				s=s+i;
			}
			System.out.println("tong la: "+s);
		}

	}

}
