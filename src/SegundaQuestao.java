import java.util.Scanner;

public class SegundaQuestao {

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        while (a < num) {
            if (a == num) {
                return true;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");
        try {
            int numero = scanner.nextInt();
            if (isFibonacci(numero)) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }
        } catch (Exception e) {
            System.out.println("Por favor, entre com um número válido.");
        }
        scanner.close();
    }
}
