package poo;
import java.util.Scanner;

public class ProcessadorCaixa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ValorUsuario valorUsuario = new ValorUsuario(Integer.parseInt(leitor.nextLine()));

		CaixaEletronico caixaEletronico = new CaixaEletronico();
		caixaEletronico.darNota(valorUsuario);
		
		leitor.close();
			
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		for (double nota : notas) {
//			if (nota == valorDigitado) {
//				System.out.println("1 nota de " + nota);
//				break;
//			} else if (valorDigitado > nota) {
//				int quantidadeNotas = (int) (valorDigitado / nota);
//				System.out.println(quantidadeNotas + " nota de " + nota);
//				valorDigitado = valorDigitado - (quantidadeNotas * nota);
//				if (valorDigitado == 0) {
//					break;
//				}
//			}
//		}
//
//	}
//
//}
