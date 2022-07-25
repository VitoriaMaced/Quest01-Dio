package questao01Dio;

public class main {

    public static void main(String[] args){

        System.out.println("Exercicio calcularo");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        System.out.println("Exercicio mensagem");
        mensagem.obterMensagem(9);
        mensagem.obterMensagem(14);
        mensagem.obterMensagem(1);

        System.out.println("Exercicio Emprestimo");
        Empestimo.calcular(1000, Empestimo.getDuasParcelas());
        Empestimo.calcular(1000, Empestimo.getTresParcelas());
        Empestimo.calcular(1000,  5);
    }


}
