import java.util.Locale;
import java.util.Scanner;

public class SobreMin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a Altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();

        

        
        System.out.println("Olá, sou " + nome + " " + sobrenome);
        System.out.println("Tenho "+ idade + " anos");
        System.out.println("Minha altura é " + altura + "m");
        System.out.println("Meu peso é " + peso + "kg");
    }
}
