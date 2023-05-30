public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Este programa calcula o fatorial de um número!");

        int numero, fatorial, valor;

        numero = Integer.parseInt(System.console().readLine("Digite um número inteiro positivo: "));
        valor = 2;
        fatorial = 1;

        while (valor <= numero) {
            fatorial = fatorial * valor;
            valor = valor + 1;
        }

        System.out.printf("O fatorial de %d é %d.\n", numero, fatorial);
    }
}
