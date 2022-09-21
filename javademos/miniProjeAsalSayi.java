package javademos;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayi Asal Sayi Değildir.");
			return ;
		}
		if(number<1) {
			System.out.println("Geçersiz sayi");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
			
		}
		if(isPrime == true) {
			System.out.println("Sayi Asal Sayidir.");
		}
		else {
			System.out.println("Sayi Asal Sayi Değildir.");
		}
	}

}
