import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int primeiroNumero;
		int segundoNumero;
		int terceiroNumero;
		String maiorNumero;
		
		System.out.print ("Digite o primeiro n�mero: ");
		primeiroNumero = ler.nextInt();
		System.out.print ("Digite o segundo n�mero: ");
		segundoNumero = ler.nextInt();
		System.out.print ("Digite o terceiro n�mero: ");
		terceiroNumero = ler.nextInt();
		
		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			maiorNumero = "primeiro";
		} else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			maiorNumero = "segundo";
		} else {
			maiorNumero = "terceiro";
		}
		
		System.out.print ("O maior n�mero � o " + maiorNumero);
	}

}
