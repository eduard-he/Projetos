package Dominio;

public class Produto {
    private String name;
    private int plu;
    private int quantity;
    private double value;

    //Cria uma instancia que facilita o nomeiamento das variaveis
    public void init(String name, int plu, int quantity, double value) {
        this.name = name;
        this.plu = plu;
        this.quantity = quantity;
        this.value = value;
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

    public int getQuantity(int quantity) {
        return quantity;
    }

    public void setQuantity() {
        this.quantity = quantity;
    }

    public double getValue(double value) {
        return value;
    }

    public void setValue() {
        this.value = value;
    }
}
