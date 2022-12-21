import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int primeiroNumero;
		int segundoNumero;
		int terceiroNumero;
		String maiorNumero;
		
		System.out.print ("Digite o primeiro número: ");
		primeiroNumero = ler.nextInt();
		System.out.print ("Digite o segundo número: ");
		segundoNumero = ler.nextInt();
		System.out.print ("Digite o terceiro número: ");
		terceiroNumero = ler.nextInt();
		
		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			maiorNumero = "primeiro";
		} else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			maiorNumero = "segundo";
		} else {
			maiorNumero = "terceiro";
		}
		
		System.out.print ("O maior número é o " + maiorNumero);
	}

}
