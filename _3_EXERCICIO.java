import java.util.Scanner;

public class _2_EXERCICIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int next, somaTotal = 0;

        System.out.println("Termos somados: ");

        while (b < 50000) {
            next = a + b;

            if (next >= 50000) {
                break;
            }

            if (next %2 != 0 && next %3 == 0) {
                System.out.println(next + " ");
                somaTotal += next;
            }

            a = b;
            b = next;
        }
        System.out.println("Soma final: " +somaTotal);

        sc.close();
    }
}
