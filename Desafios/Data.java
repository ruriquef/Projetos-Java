public class Data {
    public static void main(String[] args) {
        System.out.println("Esse programa recebe a data em números e converte para extenso!");

        int dia, mes, ano;
        String mesExtenso = null;
        mes = 0;
        System.out.println("Aqui você insera a data:");
        dia = Integer.parseInt(System.console().readLine("Dia: "));
        mes = Integer.parseInt(System.console().readLine("Mês: "));
        ano = Integer.parseInt(System.console().readLine("Ano: "));

        switch (mes) {
            case 1:
                mesExtenso = "Janeiro";
                break;
            case 2:
                mesExtenso = "Fevereiro";
                break;
            case 3:
                mesExtenso = "Março";
                break;
            case 4:
                mesExtenso = "Abril";
                break;
            case 5:
                mesExtenso = "Maio";
                break;
            case 6:
                mesExtenso = "Junho";
                break;
            case 7:
                mesExtenso = "Julho";
                break;
            case 8:
                mesExtenso = "Agosto";
                break;
            case 9:
                mesExtenso = "Setembro";
                break;
            case 10:
                mesExtenso = "Outubro";
                break;
            case 11:
                mesExtenso = "Novembro";
                break;
            case 12:
                mesExtenso = "Dezembro";
                break;
            default:
                System.out.println("Mês inválido!");

        }

        if (mesExtenso != null){
            System.out.printf("Dia %d de %s de %d.\n", dia, mesExtenso, ano);
        }

    }
}
