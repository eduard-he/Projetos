package Dominio;

public class Produto {
    private String nome;
    private int plu;
    private int quantidade;
    private double valor;
    private int diasParaVencer;


    //Aqui eu crio um contrutor para facilitar a passagem de dados e para não quebrar o cod da galera
    public Produto(String name, int plu, double value, int quantity,int diasParaVencer) {
        this.nome = name;
        this.plu = plu;
        this.valor = valor;
        this.quantidade = quantidade;
        this.diasParaVencer = diasParaVencer;
    }
    @Override
    public String toString() {
        return "Produto: " + nome +
                " | Código: " + plu +
                " | Valor: R$ " + valor +
                " | Quantidade: " + quantidade ;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public int getPlu() {
        return plu;
    }

    public void setPlu(int plu) {
        this.plu = plu;
    }

    public int getQuantity() {return quantidade; }

    public void setQuantity() {
        this.quantidade = quantidade;
    }

    public double getValue() {
        return valor;
    }

    public void setValue(double value) {
        this.valor = value;
    }
    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }
}