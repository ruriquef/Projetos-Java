public class ChecaPlacas {
    public static void main(String[] args) {
        System.out.println("Este programa verifica quando seu carro deve ir fazer a vistoria!");

        String mes = null;
        String placa = null;
        placa = System.console().readLine("Digite a placa do seu carro: (São aceitas somente placas terminadas entre 0 e 9) ");
        var finalPlaca = placa.charAt(placa.length() - 1);
        System.out.println(finalPlaca);

        switch (finalPlaca) {
            case '0': {
                mes = "Janeiro";
                break;
            }
            case '1':
                mes = "Fevereiro";
                break;
            case '2':
                mes = "Março";
                break;
            case '3':
                mes = "Abril";
                break;
            case '4':
                mes = "Maio";
                break;
            case '5':
                mes = "Junho";
                break;
            case '6':
                mes = "Setembro";
                break;
            case '7':
                mes = "Outubro";
                break;
            case '8':
                mes = "Novembro";
                break;
            case '9':
                mes = "Dezembro";
                break;
            default:
                System.out.println("Placa não registrada!");
        }
        if (mes != null) {
            System.out.printf("Você deve realizar a vistoria do seu carro em %s do ano que vem!\n", mes);
        }
    }
}