package andreyvid.dominio;

public class Sedan extends Veiculo {


    public Sedan(int ano, int dias, String marca, String modelo, double valorPorDiaria) {
        super(ano, dias, marca, modelo, valorPorDiaria);
    }

    @Override
    public double calculoValoe(double valorPorDiaria, int dias) {
        return valorPorDiaria * dias;
    }
}
