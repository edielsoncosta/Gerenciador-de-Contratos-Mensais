import java.util.Date;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // ler os dados de um trabalhador com N contratos (N fornecido pelo usuário).
        // Depois, solicitar do usuário um mês e mostrar qual foi o salário do funcionário nesse mês
        // author: edielson costa

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter department's name: ");
        String nameDepartment = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.println("Name: ");

        sc.close();

    }
}