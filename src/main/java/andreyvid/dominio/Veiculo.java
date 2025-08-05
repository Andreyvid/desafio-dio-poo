package andreyvid.dominio;

public abstract class Veiculo {

    private String modelo;
    private int ano;
    private String marca;
    private double valorPorDiaria;
    private int dias;

    public Veiculo(int ano, int dias, String marca, String modelo, double valorPorDiaria) {
        this.ano = ano;
        this.dias = dias;
        this.marca = marca;
        this.modelo = modelo;
        this.valorPorDiaria = valorPorDiaria;
    }


    public abstract double calculoValoe(double valorPorDiaria, int dias);

    @Override
    public String toString() {
        return "Pedido realizado!" + "\n" +
                "marca: " + marca + "\n" +
                "modelo: " + modelo + "\n" +
                "ano: " + ano + "\n" +
                String.format("total: R$%.2f ", calculoValoe(valorPorDiaria, dias));
    }
}


