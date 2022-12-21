import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		float primeiraNota;
		float segundaNota;
		float terceiraNota;
		float mediaNotas;
		String resultado = "reprovado";
		
		System.out.print ("Digite a primeira nota: ");
		primeiraNota = ler.nextFloat();
		System.out.print ("Digite a segunda nota: ");
		segundaNota = ler.nextFloat();
		System.out.print ("Digite a terceira nota: ");
		terceiraNota = ler.nextFloat();
		
		mediaNotas = (primeiraNota + segundaNota + terceiraNota) / 3 ;

		if (mediaNotas >= 6) {
			resultado = "aprovado";
		}
		
		System.out.print ("O aluno foi " + resultado + " com média " + mediaNotas);
	}

}
