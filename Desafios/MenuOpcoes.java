public class MenuOpcoes {
    public static void main(String[] args) {
        System.out.println("Menu de Opções:");
        System.out.println("1. Somar dois números:");
        System.out.println("2. Número ao quadrado:");

        int escolhaUsr;
        double n1, n2, n3, soma, aoQuadrado;

        escolhaUsr = Integer.parseInt(System.console().readLine("Opção: "));

        switch (escolhaUsr) {
            case 1: {
                n1 = Double.parseDouble(System.console().readLine("Digite o primeiro número: "));
                n2 = Double.parseDouble(System.console().readLine("Digite o segundo número: "));
                soma = n1 + n2;
                System.out.printf("A soma entre %.1f e %.1f é: %.1f\n", n1, n2, soma);
                break;
            }
            case 2: {
                n3 = Double.parseDouble(System.console().readLine("Digite um número: "));
                aoQuadrado = n3 * 2;
                System.out.printf("O número %.1f ao quadrado é %.1f\n", n3, aoQuadrado);
                break;
            }
            default:
                System.out.println("Opção inválida!");
                return;
        }
    }
}