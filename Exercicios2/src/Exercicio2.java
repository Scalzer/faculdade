import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numeroInteiro;
		String numero = "impar";
		
		System.out.print ("Digite um n�mero inteiro: ");
		numeroInteiro = ler.nextInt();
		
		if (numeroInteiro % 2 == 0) {
			numero = "par";
		}
		
		System.out.print ("O n�mero " + numeroInteiro + " � " + numero);
	}

}
