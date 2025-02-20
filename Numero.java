import java.util.ArrayList;
import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        // Cria um ArrayList de Integer
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário 10 números
        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            lista.add(numero);

            // Verifica se o número digitado é 10, 100 ou 1000
            if (numero == 10 || numero == 100 || numero == 1000) {
                System.out.println("Você ganhou um bônus de R$ 50,00!");
            }
        }

        // Exibe a lista de números informados
        System.out.println("\nLista de números informados: " + lista);

        scanner.close();
    }
}
