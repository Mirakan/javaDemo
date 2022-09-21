package javademos;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'F';
		
		switch (grade) {
		case 'A':
			System.out.println("Yüksek Puan : Geçtiniz.");
			break;
		case 'B':
			System.out.println("İyi Puan : Geçtiniz");
			break;
		case 'C':
			System.out.println("Orta Puan : Geçtiniz");
			break;
		case 'D':
			System.out.println("Geçer Puan : Geçtiniz");
			break;
		case 'F':
			System.out.println("Kötü Puan : Kaldınız");
		default:
			System.out.println("Geçersiz not girdiniz.");
			break;
		}
	}

}
