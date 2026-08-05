import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String produto2 = sc.nextLine();
        System.out.println("Digite a quantidade do produto:");
        int quantidade2 = sc.nextInt();
        System.out.println("Digite o preço do produto:");
        double preco = sc.nextDouble();

        double preçoFinal = preco * quantidade2;

        System.out.println("Produto:" + produto2
                + "Quantidade:" + quantidade2 +
                "Preco:" + preco +
                "Preco Final:" + preçoFinal
        );
    }
}
