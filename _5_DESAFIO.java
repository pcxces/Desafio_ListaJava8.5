import java.util.Scanner;

public class _5_DESAFIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double cityA = 50.000;
        Double cityB = 150.000;
        int years = 0;

        System.out.println("Digite a taxa de crescimento anual da cidade A em %: ");
        Double taxaA = sc.nextDouble();
        Double taxaB = 1.5;

        while (cityA < cityB) {
            cityA = cityB * (1 + taxaA / 100);
            cityB = cityB * (1 + taxaB / 100);
            years++;

            double difference = cityB - cityA;
            System.out.println("Ano " +years+ ": A = " +(int)+cityA+ " | B = " +(int)+cityB);

            if (difference < 10000 || years %5 == 0) {
                System.out.println("Atenção: Cidades se aproximando em tamanho!");
            }
        }
        System.out.println("================= STATUS =================");
        System.out.println("Cidade A ultrapassou B em: " +years+ " anos.");
        System.out.println("===========================================");

        sc.close();
    }
}
