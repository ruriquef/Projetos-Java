public class salarioLiquidoProf {
	public static void main(String[] args) {
		double valor_hora, perc_inss;
		double sal_bruto, desc_inss, sal_liq;
		double horas_trab;
		
		valor_hora = Double.parseDouble(System.console().readLine("Valor da hora-aula: "));
		horas_trab = Double.parseDouble(System.console().readLine("Número de horas trabalhadas: "));
		perc_inss = Double.parseDouble(System.console().readLine("Percentual de desconto INSS: "));
		
		sal_bruto = valor_hora * horas_trab;
		desc_inss = perc_inss / 100 * sal_bruto;
		sal_liq = sal_bruto - desc_inss;
		
		System.out.printf("Salário liquido do professor = R$ %.2f\n", sal_liq);
	}
}
