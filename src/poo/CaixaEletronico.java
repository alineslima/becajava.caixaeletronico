package poo;

public class CaixaEletronico {

	private int[] notas = { 200, 100, 50, 20, 10, 5, 2 };
	private int quantidadeNotas;

	
	public void darNota(ValorUsuario valorUsuario) {
		for (int nota : notas) {
			if (valorUsuario.getValorUsuario() == nota) {
				System.out.println("1 nota de " + nota);
				break;
			} else if(valorUsuario.getValorUsuario() > nota) {
				quantidadeNotas = valorUsuario.getValorUsuario() / nota;
				System.out.println(quantidadeNotas + " nota de " + nota); 
				if(valorUsuario.getValorUsuario() - (quantidadeNotas*nota) == 0) {
					break;
				}
				int valorRestante = valorUsuario.getValorUsuario() - (quantidadeNotas*nota);
				valorUsuario.setValorUsuario(valorRestante);
				
				
			}

		}
	}

}

