package Teste;

import Dominio.CalculadorEstoque;
import Dominio.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {

        //Criar o objeto e já faz uma lista para deixalo organizado
        Produto[] estoque = new Produto[3];
        CalculadorEstoque calc = new CalculadorEstoque();
        Produto produto = new Produto();

        //Nomeia o produto e deixa em uma lista
        estoque[0] = new Produto();
        estoque[0].init("Arroz", 11111, 15000, 5.80);

        estoque[1] = new Produto();
        estoque[1].init("feijão", 5555, 2000, 10);


        // 1. Percorre o array 'estoque' para imprimir cada item cadastrado
        for (Produto p : estoque) {
            if (p != null) {
                p.imprime();
            }

        }
        calc.calculadora(estoque);
    }
}