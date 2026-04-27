package Teste;

import Dominio.CalculadorEstoque;
import Dominio.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        CalculadorEstoque calc = new CalculadorEstoque();

        Produto p1 = new Produto("Arroz", 11111, 5.50, 15000);
        Produto p2 = new Produto("Feijão", 5555, 8.00, 10000);


        //percorre cada produto para emprimilo
        for (Produto p : new Produto[]{p1, p2}) {
            p.imprime();
        }

       
        calc.calculadora(p1, p2);
    }
}
