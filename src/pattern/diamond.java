package pattern;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int n1 = n/2;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				// Square
				if(i==0 || j==0 || i== n-1 || j==n-1 ) {
					System.out.print("#");
				}
				
				// left-top diagonal
				else if(i+j<=n1) {
					System.out.print("&");
				}
				
				//right - top diagonal
				else if(j-i>=n1) {
					System.out.print("@");
				}
				
				// left-bottom diagonal
				else if(i-j>=n1) {
					System.out.print("(");
				}
				
				//right-bottom diagonal
				else if(i+j >= (n-1+n1)) {
					System.out.print("%");
				}
				
				// Space
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
