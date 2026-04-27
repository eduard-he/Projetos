package Dominio;

public class Validade {
    private double descontoBaixo = 0.25;
    private double descontoAlto = 0.50;

    public void aplicarDescontoValidade(Produto... produtos) {
        for (Produto p : produtos) {
            double valorOriginal = p.getValue();
            double novoValor = valorOriginal;

            if (p.getDiasParaVencer()  <= 0) {
                System.out.println("\n[RECOLHIMENTO IMEDIATO] 🛑");
                System.out.println("Produto: " + p.getName() + " está VENCIDO!");
                System.out.println("CRÍTICO - REMOVER DA PRATELEIRA");
                continue;
            }
            if (p.getDiasParaVencer() <= 5) {
                System.out.println("\n[ALERTA DE ESTOQUE] ⚠️");
                System.out.println("O produto '" + p.getName() + "' vence em " + p.getDiasParaVencer() + " dias!");


                if (p.getQuantity() >= 60) {
                    novoValor = valorOriginal * (1 - descontoAlto);
                    System.out.println("Ação: Aplicado desconto CRÍTICO de 50% devido ao alto estoque (" + p.getQuantity() + " un).");
                } else if (p.getQuantity() >= 30) {
                    novoValor = valorOriginal * (1 - descontoBaixo);
                    System.out.println("Ação: Aplicado desconto de 25% (Estoque: " + p.getQuantity() + " un).");
                }
                else {
                    novoValor = valorOriginal * 0.80; // 20% de desconto simbólico
                    System.out.println("Ação: Desconto de 20% aplicado para baixa quantidade em vencimento.");
                }


                p.setValue(novoValor);
                System.out.println("Status: Preço atualizado de R$ " + valorOriginal + " para R$ " + novoValor);
                System.out.println("-----------------------------------------------------------------");
            }
        }
    }
}