import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		float primeiroNumero;
		float segundoNumero;
		float resultado = 0;
		byte opcao;
		boolean sair = false;
		
		System.out.print ("Digite o primeiro número: ");
		primeiroNumero = ler.nextFloat();
		System.out.print ("Digite o segundo número: ");
		segundoNumero = ler.nextFloat();
		
		System.out.println ("Digite 1 para somar");
		System.out.println ("Digite 2 para subtrair");
		System.out.println ("Digite 3 para multiplicar");
		System.out.println ("Digite 4 para dividir");
		System.out.println ("Digite 5 para sair");
		System.out.print ("Escolha a sua opção: ");
		opcao = ler.nextByte();
		
		switch(opcao) {
		case 1:
			resultado = primeiroNumero + segundoNumero;
			break;
		case 2:
			resultado = primeiroNumero - segundoNumero;
			break;
		case 3:
			resultado = primeiroNumero * segundoNumero;
			break;
		case 4:
			resultado = primeiroNumero / segundoNumero;
			break;
		case 5:
			sair = true;
			System.out.print ("Calculadora encerrada");
			break;
		default:
			sair = true;
			System.out.print ("Opção inválida");
			break;
		}
		if(! sair) {
			System.out.print ("O resultado dessa operação é: " + resultado);
		}

	}

}
