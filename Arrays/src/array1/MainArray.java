package array1;
import java.util.Arrays;
public class MainArray {
	
		static char[][] quadroDeEstrelas = new char [10][10];
		
	public static void construirQuadroDeEstrelas() {
			
		for(char[] row : quadroDeEstrelas) {
				
			Arrays.fill(row, '*');
				
			}
		}
		
		
		public static void fazer() {
			
			int k = 1;
			while(k <= 50) {System.out.print('ˆ'); k++;}
			System.out.println();
			
			for(int i =0; i< quadroDeEstrelas.length; i++) {
				
					for(int j=0;j< quadroDeEstrelas[i].length; j++ ) {
						
						System.out.print("|"+quadroDeEstrelas[i][j]+ "|" );
					}
					System.out.println();
			}
			
			k = 1;
			while(k <= 30) {System.out.print('ˆ'); k++;}
			System.out.println();
		
			
		}
		

}
