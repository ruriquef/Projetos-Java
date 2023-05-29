public class VerificaIdade {
	public static void main(String[] args) {
		System.out.println("Este programa irá verificar sua idade!");

		int diaMesNasc, mesNasc, anoNasc;
		 int diaMesAtual, mesAtual, anoAtual; 
		int calculo, idade;

		System.out.println("Aqui você insere a data do seu nascimento (29, 01, 2001):");

		diaMesNasc = Integer.parseInt(System.console().readLine("Dia do mês: "));
		mesNasc = Integer.parseInt(System.console().readLine("Mês: "));
		anoNasc = Integer.parseInt(System.console().readLine("Ano: "));

		System.out.println("Aqui você insere a data atual (26, 05, 2023): ");

		
		diaMesAtual = Integer.parseInt(System.console().readLine("Dia do mês: "));
		mesAtual = Integer.parseInt(System.console().readLine("Mês: "));
		anoAtual = Integer.parseInt(System.console().readLine("Ano: "));
		 
		calculo = anoAtual - anoNasc;
		 
		if (diaMesNasc < diaMesAtual && mesAtual <= mesNasc) {
		  idade = calculo - 1;
		}else {
		  idade = calculo;
		}
		System.out.printf("Atualmente você tem %d anos\n", idade);

	}
}