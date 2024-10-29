import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner scanner = new Scanner(System.in);
        
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		int V = scanner.nextInt();

		int pertambahan =  M + V ; 


	
		
	    int hasilKurang = 0 ; 
		if (pertambahan > 60 ) {
			H ++ ;
		hasilKurang = pertambahan - 60 ;
		System.out.println(H + ":" + hasilKurang);
		} else {
			System.out.println(H + ":" + pertambahan);
		}
	 


		
	}
}	
