import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner(System.in);
		
		double valorDigitado = Double.parseDouble(leitor.nextLine());
		
		double[] notas = {200,100,50,20,10,5,2};
		
		for (double nota : notas) {
			if(nota == valorDigitado) {
				System.out.println("1 nota de " + nota);
				break;
			} else if(valorDigitado > nota) {
				int quantidadeNotas = (int)(valorDigitado / nota);
				System.out.println(quantidadeNotas + " nota de " + nota);
				valorDigitado = valorDigitado - (quantidadeNotas * nota);
				if(valorDigitado == 0) {
					break;
				}
			}
		}
		
		
		
		
		
		
		leitor.close();

	}

}
