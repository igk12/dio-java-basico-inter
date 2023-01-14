public class SobreMin {
    public static void main(String[] args) {

        String nome = args [0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        double peso = Double.valueOf(args[4]);

        
        System.out.println("Olá, sou " + nome + " " + sobrenome);
        System.out.println("Tenho "+ idade + " anos");
        System.out.println("Minha altura é " + altura + "m");
        System.out.println("Meu peso é " + peso + "kg");
    }
}
