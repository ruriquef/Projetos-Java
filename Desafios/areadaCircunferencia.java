public class areadaCircunferencia {
	public static void main(String[] args) {
		Double raio, area;
		
		raio = Double.parseDouble(System.console().readLine("Informe o raio da circunferencia: "));
		area = 3.14159 * raio * raio;
		
		System.out.printf("Área da circunferencia = %f\n", area);
	}
}
