import java.util.Scanner;

public class ConversaoWrapper {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um valor numérico: ");
            int valorPrimitivo = scanner.nextInt();
            Integer valorWrapper = Integer.valueOf(valorPrimitivo);

            System.out.println("Valor convertido para wrapper: " + valorWrapper);
        }
    }
}
