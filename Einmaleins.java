public class Einmaleins {

	public static void main(String[] args) {
		int sayi;
		for (sayi = 1; sayi <= 10; sayi++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(String.format("%6s%3d", sayi + "*" + i + "=", sayi * i) + "\t");
			}
			System.out.println("");
		}
	}
}
