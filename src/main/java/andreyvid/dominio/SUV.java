package andreyvid.dominio;

public class SUV extends Veiculo {


    public SUV(int ano, int dias, String marca, String modelo, double valorPorDiaria) {
        super(ano, dias, marca, modelo, valorPorDiaria);
    }

    @Override
    public double calculoValoe(double valorPorDiaria, int dias) {
        return valorPorDiaria * dias;
    }
}
