import java.util.Scanner;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numeroInteiro;
		String numero = "não está";
		
		System.out.print ("Digite um número inteiro: ");
		numeroInteiro = ler.nextInt();
		
		if (numeroInteiro > 0 && numeroInteiro <= 10) {
			numero = "está";
		}
		System.out.print ("O número " + numeroInteiro + " " + numero + " entre 0 e 10, inclusive");
	}

}
