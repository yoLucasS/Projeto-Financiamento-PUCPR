import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static String readString(String tittle) {
        System.out.print(tittle);
        return scanner.nextLine();
    }
    public static int readInt(String tittle) {
        while (true) {
            System.out.print(tittle);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            }
        }
    }
    public static double readDouble(String tittle) {
        while (true) {
            System.out.print(tittle);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número decimal.");
            }
        }
    }
    public static boolean readBoolean(String tittle) {
        while (true) {
            System.out.print(tittle + " (true/false): ");
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("true") || input.equals("false")) {
                return Boolean.parseBoolean(input);
            } else {
                System.out.println("Entrada inválida. Por favor, insira 'true' ou 'false'.");
            }
        }
    }
}
