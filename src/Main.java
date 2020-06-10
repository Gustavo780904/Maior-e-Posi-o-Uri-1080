import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = 0, ordem = 0, posicao, maior = 0;
		
		for(posicao = 1; posicao <= 100; posicao ++) {
			N = sc.nextInt();
			if (N > maior) {
				maior = N;
				ordem = posicao;
			}
		}
		System.out.println(maior);
		System.out.println(ordem);
		
		
		sc.close();
	}

}
