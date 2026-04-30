import java.util.Scanner;

public class _4_DESAFIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int verify = 0;
        Double cal;

        do {
            System.out.println("Informe o consumo mensal em metros: ");
            int mensal = sc.nextInt();

            if (mensal <= 15) {
                System.out.println("=============== ABAIXO 15 METROS ===============");
                System.out.println("Taxa por metro: R$ 00,00");
                System.out.println("Preço fixo: R$ 35,00");
                System.out.println("------------------------------------------");
                System.out.println("Deseja realizar a compra: ");
                System.out.println("1. SIM");
                System.out.println("2. NÃO");
                System.out.println("================================================");

                verify = sc.nextInt();
            } else if (verify != 1 && verify != 2) {
                System.out.println("Operação invalida, digite apenas 1 ou 2!");
            }
            if (verify == 1) {
                System.out.println("Compra realizada com sucesso!");
            } else System.out.println("Compra cancelada.");


            if (mensal > 15 && mensal <= 30) {
                System.out.println("=============== ABAIXO 30 METROS ===============");
                System.out.println("Taxa por metro: R$ 4,50");
                System.out.println("Preço fixo: R$ 35,00");
                cal = 35.00 + (mensal - 15) * 4.50;
                System.out.println("Taxa + preço fixo: R$ " + cal);
                System.out.println("------------------------------------------");
                System.out.println("Deseja realizar a compra: ");
                System.out.println("1. SIM");
                System.out.println("2. NÃO");
                System.out.println("================================================");

                verify = sc.nextInt();
            } else if (verify != 1 && verify != 2) {
                System.out.println("Operação invalida, digite apenas 1 ou 2!");
            }
            if (verify == 1) {
                System.out.println("Compra realizada com sucesso!");
            } else System.out.println("Compra cancelada.");


            if (mensal > 30) {
                System.out.println("=============== ACIMA 30 METROS ===============");
                System.out.println("Taxa por metro: R$ 7,00");
                System.out.println("Preço fixo: R$ 35,00");
                cal = 35.00 + (mensal - 15) * 7.00;
                System.out.println("Taxa + preço fixo: R$ " + cal);
                System.out.println("------------------------------------------");
                System.out.println("Deseja realizar a compra: ");
                System.out.println("1. SIM");
                System.out.println("2. NÃO");
                System.out.println("================================================");
                verify = sc.nextInt();
            } else if (verify != 1 && verify != 2) {
                System.out.println("Operação invalida, digite apenas 1 ou 2!");
            }
            if (verify == 1) {
                System.out.println("Compra realizada com sucesso!");
            } else System.out.println("Compra cancelada.");

        } while (verify == 2);
        sc.close();
    }
}
