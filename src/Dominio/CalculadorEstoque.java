package Dominio;

public class CalculadorEstoque {

    private double faturamento;
    private double faturamentoP;





    public void calculadora(Produto... produto) { //Aqui é para pegar todas as variaveis da lista e eu o nomeio 'produto'
        // O VarArgs (...) permite passar vários produtos ou um array, simplificando a chamada do metodo.

        double totalFaturamento = 0;
        String Lmite;




        for (Produto p : produto) {// Para cada 'Produto p' dentro do array 'produtos'

            if (p != null && p.getQuantity()>=0 ) { // Segurança para não dar erro se a posição estiver vazia
                totalFaturamento += p.getValue() * p.getQuantity();
            }
            else {
                System.out.println("\uD83D\uDD34➖ Atenção: Produto " + p.getName() + " com estoque negativo!");
                System.out.println("-----------------------------------------------------------------");
            }
        }

        this.faturamento = totalFaturamento;

        System.out.println("Valor previsto de NÃO PERESIVEL: " + this.faturamento);
    }

    public void calculadora1(Persivel... peresivel){

        double totalfaturamentoP = 0;

        for (Persivel p : peresivel){
            if (p != null && p.getQuantyti()>=0 ) {
                totalfaturamentoP += p.getValue() * p.getQuantyti();
            }
            else {
                System.out.println("\uD83D\uDD34➖ Atenção: Produto " + p.getNome() + " com estoque negativo!");
                System.out.println("-----------------------------------------------------------------");
            }
        }

        this.faturamentoP = totalfaturamentoP;

        System.out.println(" \uD83C\uDF21\uFE0F Valor previsto de PERESIVEIS: " + faturamentoP);
        System.out.println("-----------------------------------------------------------------");
    }

}

