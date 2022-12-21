import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		char letra;
		String tipoLetra;
		
		System.out.print ("Digite uma letra: ");
		letra = ler.next().charAt(0);
		if (letra == 'a' || letra == 'A') {
			tipoLetra = "vogal";
		} else if (letra == 'e' || letra == 'E') {
			tipoLetra = "vogal";
		} else if (letra == 'i' || letra == 'I') {
			tipoLetra = "vogal";
		} else if (letra == 'o' || letra == 'O') {
			tipoLetra = "vogal";
		} else if (letra == 'u' || letra == 'U') {
			tipoLetra = "vogal";
		} else {
			tipoLetra = "consoante";
		}
		System.out.print ("A letra digitada é uma " + tipoLetra);
	}
	
}
