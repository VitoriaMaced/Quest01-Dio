package questao01Dio;

import java.security.PublicKey;

public class mensagem {

    public static void obterMensagem(int hora) {

        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                MensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                MensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 1:
            case 2:
            case 3:
            case 4:
                MensagemBoaNoite();
                break;
            default:
                System.out.println("Hora Invalida");
                break;
    }
}

    public static void MensagemBomDia() {
            System.out.println("Bom Dia");
        }
    public static void MensagemBoaTarde() {
            System.out.println("Boa Tarde");
        }
    public static void MensagemBoaNoite() {
            System.out.println("Boa Noite");
        }
}
