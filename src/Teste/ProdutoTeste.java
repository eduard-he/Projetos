package Teste;

import Dominio.CalculadorEstoque;
import Dominio.Produto;
import Dominio.Persivel;
import Dominio.Validade;

public class ProdutoTeste {
    public static void main(String[] args) {
        CalculadorEstoque calc = new CalculadorEstoque();
        Validade validador = new Validade();



        Persivel pp1 = new Persivel("Danone" , 15,500,8888);
        Persivel pp2 = new Persivel("Queijo" , 20,-200,7888);

        Produto p1 = new Produto("Arroz", 11111, 5.50, 300,30);
        Produto p2 = new Produto("Feijão", 5555, 8.00, -10,60);

        for (Persivel p : new Persivel[]{pp1, pp2}) {
            System.out.println(p);
        }

        calc.calculadora1(pp1,pp2);

        for (Produto p : new Produto[]{p1,p2}){
            System.out.println(p);
        }

        validador.aplicarDescontoValidade(p1, p2);

        calc.calculadora(p1, p2);
    }
}
