
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double numero1, numero2, resultado;
        int opcao;

        System.out.println("Digite o numero: ");
        numero1 = leitor.nextDouble();

        System.out.println("Digite o segundo numero: ");
        numero2 = leitor.nextDouble();

        System.out.println("Escolha uma operacao: ");
        System.out.println("1 adicao");
        System.out.println("2 subtracao");
        System.out.println("3 multiplicacao");
        System.out.println("4 divisao");

        opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {

                    System.out.println("Nao é possivel dividir por 0.");
                }
         break;
        
            default:
                System.out.println("Opcao invalida.");
        }
        
    }

}
