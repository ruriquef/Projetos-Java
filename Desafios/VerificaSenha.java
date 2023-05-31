public class VerificaSenha {
    public static void main(String[] args) {
        System.out.println("login: user@dev.com");

        int usr, senha = 1234, tentativas = 4;

        do{
            usr = Integer.parseInt(System.console().readLine("Digite sua senha numérica de 4 digitos: \n"));
            if (usr != senha && tentativas > 0) {
                System.out.printf("Senha incorreta! Você tem mais %d tentativas\n", tentativas -1);
                tentativas = tentativas -1;
            if (tentativas == 0) {
                System.out.println("Acesso negado! Número de tentativas excedidas!");
                return;
            }
                
            }
        }while (usr != senha && tentativas > 0);
            System.out.println("Acesso liberado!");
    }
}
