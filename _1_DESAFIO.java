import java.util.Scanner;

public class _1_DESAFIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, div, mult, cont = 0;
        int verify;

        do {
            do {
                System.out.println("Informe os números e insira o 1 para parar");
                num = sc.nextInt();

                if (num == 1) {
                    break;
                }
                if (num % 2 == 0) {
                    div = num / 2;
                    cont++;
                    System.out.println("=============== NÚMERO PAR ===============");
                    System.out.println("A divisão dos números é: " + div);
                    System.out.println("Quantidade de passos: " + cont);
                    System.out.println("==========================================");
                } else {
                    mult = num * 3;
                    cont++;
                    System.out.println("=============== NÚMERO IMPAR ===============");
                    System.out.println("A multplicação dos números é: " + mult);
                    System.out.println("Quantidade de passos: " + cont);
                    System.out.println("============================================");
                }
            } while (num != 1);

            do {
                System.out.println("Você realmente deseja fechar o programa: ");
                System.out.println("1. SIM");
                System.out.println("2. NÃO");
                verify = sc.nextInt();
                if (verify != 1 && verify != 2) {
                    System.out.println("Operação invalida, digite 1 ou 2");
                }
            } while (verify != 1 && verify != 2);

        } while (verify != 1);

        System.out.println("Programa encerrado!");

        sc.close();
    }
}
