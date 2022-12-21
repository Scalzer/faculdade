import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		float salarioBruto;
		float valorPrestacao;
		float valorMaximoPrestacao;
		String emprestimo = "não pode";
		
		System.out.print ("Digite o seu salário bruto: ");
		salarioBruto = ler.nextFloat();
		System.out.print ("Digite o valor da prestação: ");
		valorPrestacao = ler.nextFloat();
		
		valorMaximoPrestacao = salarioBruto / 100 * 30;
		
		if (valorPrestacao <= valorMaximoPrestacao ) {
			emprestimo = "pode";
		}
		
		System.out.print ("O empréstimo " + emprestimo + " ser concedido");
	}

}
