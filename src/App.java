import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int a = entrada.nextInt();
        System.out.println("Digite o segundo numero:");
        int b = entrada.nextInt();
        int soma = a + b;
        System.out.println("A soma dos dois numeros foi:" + soma);
    }
}
