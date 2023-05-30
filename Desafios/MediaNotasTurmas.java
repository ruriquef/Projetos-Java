public class MediaNotasTurmas {
    public static void main(String[] args) {
        System.out.println("Este programa calcula a média de notas de uma turma!(Digite um número negativo para encerrar).");

        int cont;
        double soma, media, notas;

        cont = 0;
        soma = 0;
        notas = Integer.parseInt(System.console().readLine("Digite a nota do 1° aluno: "));

        if (notas >= 0) {
            while (notas >= 0) {
                soma = soma + notas;
                cont = cont + 1;
                notas = Double.parseDouble(System.console().readLine("Digite a nota do %d° aluno: ", cont + 1));
            }
        media = soma / cont;
        
        System.out.printf("A média de notas da turma foi de: %.1f\n", media);
        
        }else {
            System.out.println("Erro! A primeira nota precisa ser válida!");
        }
    }
}
