import java.util.Scanner;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numeroInteiro;
		String numero = "n�o est�";
		
		System.out.print ("Digite um n�mero inteiro: ");
		numeroInteiro = ler.nextInt();
		
		if (numeroInteiro > 0 && numeroInteiro <= 10) {
			numero = "est�";
		}
		System.out.print ("O n�mero " + numeroInteiro + " " + numero + " entre 0 e 10, inclusive");
	}

}
