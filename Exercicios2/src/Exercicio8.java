import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		float salarioBruto;
		float valorPrestacao;
		float valorMaximoPrestacao;
		String emprestimo = "n�o pode";
		
		System.out.print ("Digite o seu sal�rio bruto: ");
		salarioBruto = ler.nextFloat();
		System.out.print ("Digite o valor da presta��o: ");
		valorPrestacao = ler.nextFloat();
		
		valorMaximoPrestacao = salarioBruto / 100 * 30;
		
		if (valorPrestacao <= valorMaximoPrestacao ) {
			emprestimo = "pode";
		}
		
		System.out.print ("O empr�stimo " + emprestimo + " ser concedido");
	}

}
