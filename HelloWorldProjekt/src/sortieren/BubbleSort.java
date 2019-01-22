package sortieren;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] zahlen = { 3, 1, 9, 5, 2, 8, 6, 5 };
		
		//
		for (int n = zahlen.length; n>1; --n) {
			for (int i=0; i<n-1; ++i) 
				if (zahlen [i] > zahlen[i + 1]) {
					int help = zahlen [1];
					zahlen[1] = zahlen[i+1];
					zahlen [i+1] = help;
					
						
					}
							
				}
				
				}

}
