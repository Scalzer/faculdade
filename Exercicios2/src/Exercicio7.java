import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		float peso;
		float altura;
		float imc;
		String classificacao;
		
		System.out.print ("Digite o seu peso: ");
		peso = ler.nextFloat();
		System.out.print ("Digite a sua altura: ");
		altura = ler.nextFloat();
	
		imc = peso / (altura * altura);
		
		if (imc < 18.5) {
			classificacao = "magreza";
		} else if (imc < 24.9) {
			classificacao = "normal";
		} else if (imc < 29.9) {
			classificacao = "sobrepeso";
		} else if (imc < 39.9) {
			classificacao = "obesidade";
		} else {
			classificacao = "obesidade grave";
		}
		
		System.out.print ("A classificacão dessa pessoa de acordo com o IMC é: " + classificacao);

	}

}
