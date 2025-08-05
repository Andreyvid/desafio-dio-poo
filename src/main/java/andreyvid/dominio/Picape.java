package andreyvid.dominio;

public class Picape extends Veiculo {


    public Picape(int ano, int dias, String marca, String modelo, double valorPorDiaria) {
        super(ano, dias, marca, modelo, valorPorDiaria);
    }

    @Override
    public double calculoValoe(double valorPorDiaria, int dias) {
        return valorPorDiaria * dias;
    }
}
