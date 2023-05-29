public class MediaNotas {
	public static void main(String[] args) {
		Double n1, n2, n3, n4, soma;
		
		n1 = Double.parseDouble(System.console().readLine("Digite a primeira nota: "));
		n2 = Double.parseDouble(System.console().readLine("Digite a segunda nota: "));
		n3 = Double.parseDouble(System.console().readLine("Digite a terceira nota: "));
		n4 = Double.parseDouble(System.console().readLine("Digite a quarta nota: "));
		
		soma = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("A sua m├ędia final foi de: %.1f\n", soma);
		
	}
}
