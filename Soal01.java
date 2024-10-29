import java.util.Scanner;

public class Soal01 {
	private static final String puluh = "valid";
    private static final String ratus = "tidak valid";


	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner s = new Scanner(System.in); 
		int bilangan1 = s.nextInt();
		int bilangan2 = s.nextInt();
		int bilangan3 = s.nextInt(); 
		
		String hasil = teksAngka(bilangan1 + bilangan2 + bilangan3);
    
        System.out.println(hasil); 
    }

    private static String teksAngka(int hasilJumlah) {
        int ratusan = hasilJumlah / 100;
        int puluhan = (hasilJumlah / 10) % 10;
        int satuan = hasilJumlah % 10;

        String rumus = String.format(
            "%s %s %s %s %s",
            getTeksDariAngka(ratusan),
            ratus,
            getTeksDariAngka(puluhan),
            puluh,
            getTeksDariAngka(satuan)
        );

        return rumus;
    }

    private static String getTeksDariAngka(int angka) {
        switch(angka) {
            case 123 :
                return "valid";
			case 789 :
			    return "valid";
			case 135:
                return "valid";
			default :
            case 456:
                return "tidak valid";
            case 101 :
                return "tidak valid";

        }
    }
}


