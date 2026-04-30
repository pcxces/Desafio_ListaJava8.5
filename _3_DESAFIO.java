import java.util.Scanner;

public class _3_DESAFIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        int maior, meio, menor, media, temp;

        do {
            System.out.println("Digite a primeira nota: ");
            n1 = sc.nextInt();

            if (n1 < 0) {
                break;
            }
            System.out.println("Digite a segunda nota:");
            n2 = sc.nextInt();

            System.out.println("Digite a terceira nota:");
            n3 = sc.nextInt();

            if (n1 < n2) {
                temp = n1;
                n1 = n2;
                n2 = temp;
            }
            if (n1 < n3) {
                temp = n1;
                n1 = n3;
                n3 = temp;
            }
            if (n2 < n3) {
                temp = n2;
                n2 = n3;
                n3 = temp;
            }

            maior = n1;
            meio = n2;
            menor = n3;

            media = (maior * 5 + meio * 3 + menor * 2) / 10;
            System.out.println("Média: " + media);

            if (media >= 7 && menor >= 4) {
                System.out.println("========== APPROVED ==========");
                System.out.println("Aprovado especial");
                System.out.println("Nota final: " + media);
                System.out.println("===============================");
            } else {
                System.out.println("========== FAILED ==========");
                System.out.println("Não se qualificou");
                System.out.println("Nota final: " + media);
                System.out.println("============================");
            }

        } while (n1 > 0);
        sc.close();
    }
}
