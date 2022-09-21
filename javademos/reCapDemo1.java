package javademos;

public class recapDemo1 {

	public static void main(String[] args) {
		
		int sayi1 = 21;
		int sayi2 = 8;
		int sayi3 = 39;
		int enBuyukSayi = sayi1;
		
		if (enBuyukSayi<sayi2) {
			enBuyukSayi= sayi2;	
		}else if (enBuyukSayi<sayi3) {
			enBuyukSayi = sayi3;
		
		}else {
		}
		System.out.println("En büyük sayş: "+ enBuyukSayi);
	}

}
