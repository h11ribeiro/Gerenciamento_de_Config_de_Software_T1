import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            System.out.println("Digite o valor de V: ");
            int v = in.nextInt();
            System.out.println("Digite o valor de T: ");
            int t = in.nextInt();

            int calculo = v * 2 * t;

            System.out.println(calculo);
        
     }
     System.out.println("Codigo finalizado");
    }
}