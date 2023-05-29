public class novoSalarioFunc {
	public static void main(String[] args) {
		Double salario_atual, perc_aumento;
		Double novo_sal, val_aumento;
		
		salario_atual = Double.parseDouble(System.console().readLine("sálario atual do funcionário: "));
		perc_aumento = Double.parseDouble(System.console().readLine("Percentual de aumento: "));
		
		val_aumento = salario_atual * perc_aumento / 100;
		novo_sal = salario_atual + val_aumento;
		
		System.out.printf("Valor do aumento = R$ %.2f\n", val_aumento);
		System.out.printf("Novo salário = R$ %.2f\n", novo_sal);
		
	}
}