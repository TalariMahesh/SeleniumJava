package SeleniumAutoClasses;

public class TranglePattern {

	public static void main(String[] args) {
		int i,j,k=10;
		for(i=0;i<k;i++) {
			for(j=(k-i);j>=0;j--) {
				System.out.print(" ");
						}
			for (j=0; j<=i; j++ )   {
				System.out.print("* ");
				
			}
			System.out.println();   
		}
	}
}
