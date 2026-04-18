package Dominio;

public class Produto {
    private String name;
    private int plu;
    private int quantity;
    private double value;


    //Aqui eu crio um contrutor para facilitar a passagem de dados e para não quebrar o cod da galera
    public Produto(String name, int plu, double value) {
        this.name = name;
        this.plu = plu;
        this.value = value;

    }

    public Produto(String name, int plu, double value, int quantity) {
        this(name, plu, value);
        this.quantity = quantity;

    }

    public void imprime() {
        // Só um bloco de impressão! para fazer a leitura para imprimir
        System.out.println("Nome: " + this.name);
        System.out.println("Codigo: " + this.plu);
        System.out.println("Valor: " + this.value);
        System.out.println("-----------------------------------------------------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlu() {
        return plu;
    }

    public void setPlu(int plu) {
        this.plu = plu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity() {
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }

    public void setValue() {
        this.value = value;
    }

}