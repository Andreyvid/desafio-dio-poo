package andreyvid.aplicacao;

import andreyvid.dominio.*;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========ALUGUEL DE CARROS========");
        System.out.println("Digite a categoria de veiculo na qual deseja alugar: ");
        System.out.println("1-Picape, valor diaria: R$250,00");
        System.out.println("2-SUV, valor diaria: R$220,00");
        System.out.println("3-Van, valor diaria: R$280,00");
        System.out.println("4-Sedan, valor diaria: R$180,00");

        int opcao = sc.nextInt();
        sc.nextLine();
        switch (opcao) {
            case 1 -> {
                System.out.println("Digite o modelo do carro: ");
                String modelo = sc.nextLine();
                System.out.println("Digite a marca do carro: ");
                String marca = sc.nextLine();
                System.out.println("Digite o ano do carro");
                int ano = sc.nextInt();
                System.out.println("Quantidade de dias:");
                int dias = sc.nextInt();
                double valorDiaria = 250.0;
                Veiculo veiculo = new Picape(ano, dias, marca, modelo, valorDiaria);
                System.out.printf(String.valueOf(veiculo));
            }case 2 -> {
                System.out.println("Digite o modelo do carro: ");
                String modelo = sc.nextLine();
                System.out.println("Digite a marca do carro: ");
                String marca = sc.nextLine();
                System.out.println("Digite o ano do carro");
                int ano = sc.nextInt();
                System.out.println("Quantidade de dias:");
                int dias = sc.nextInt();
                double valorDiaria = 220.0;
                Veiculo veiculo = new SUV(ano, dias, marca, modelo, valorDiaria);
                System.out.printf(String.valueOf(veiculo));
            }case 3 -> {
                System.out.println("Digite o modelo do carro: ");
                String modelo = sc.nextLine();
                System.out.println("Digite a marca do carro: ");
                String marca = sc.nextLine();
                System.out.println("Digite o ano do carro");
                int ano = sc.nextInt();
                System.out.println("Quantidade de dias:");
                int dias = sc.nextInt();
                double valorDiaria = 280.0;
                Veiculo veiculo = new Van(ano, dias, marca, modelo, valorDiaria);
                System.out.printf(String.valueOf(veiculo));
            }case 4 -> {
                System.out.println("Digite o modelo do carro: ");
                String modelo = sc.nextLine();
                System.out.println("Digite a marca do carro: ");
                String marca = sc.nextLine();
                System.out.println("Digite o ano do carro");
                int ano = sc.nextInt();
                System.out.println("Quantidade de dias:");
                int dias = sc.nextInt();
                double valorDiaria = 180.0;
                Veiculo veiculo = new Sedan(ano, dias, marca, modelo, valorDiaria);
                System.out.printf(String.valueOf(veiculo));
            }

        }

    }

}
