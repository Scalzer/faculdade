import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numeroInteiro;
		
		System.out.print ("Digite um n�mero inteiro: ");
		numeroInteiro = ler.nextInt();
		
		if (numeroInteiro < 0) {
			numeroInteiro = numeroInteiro * -1 ;
		}
		
		System.out.println ("O n�mero digitado �: " + numeroInteiro ); 
	}

}
