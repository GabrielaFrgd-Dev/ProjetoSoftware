import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      Roupas roupa = null;
      int opcao; {
          System.out.println("\n====Gerenciamento do Estoque====: ");
          System.out.println("1 - Cadastrar roupas: ");
          System.out.println("2 - Adicionar roupas ao estoque: ");
          System.out.println("3 - Remover roupas ao estoque: ");
          System.out.println("4 - Exibir informações: ");
          System.out.println("0 - Sair: ");

          System.out.println("Escolha uma opção: ");
          opcao = input.nextInt();
          input.nextLine();

          switch (opcao) {
              case 1:
                  System.out.println("\n====Cadastrar roupas====: ");

                  System.out.println("Marca: ");
                  String marca = input.nextLine();

                  System.out.println("Tipo: ");
                  String tipo = input.nextLine();

                  System.out.println("Tamanho: ");
                  String tamanho = input.nextLine();

                  System.out.println("Quantidade: ");
                  int quantidade = input.nextInt();

                  System.out.println("Valor: R$ ");
                  double valor = input.nextDouble();

                  roupa = new Roupas(marca,tipo,tamanho, quantidade, valor);

                  System.out.println("\n Roupa cadastrada com sucesso!");

                  break;

                  case 2:
                      if (roupa == null) {
                          System.out.println("Nenhuma roupa cadastrada!");
                      } else {
                          System.out.println("Quantidade para adicionar: ");
                          int adicionar = input.nextInt();

                         roupa.adicionarQuantidade(adicionar);

                          System.out.println("\nInformações atualizadas com sucesso!");
                      }

                      break;

                      case 3:
                          if (roupa == null) {
                              System.out.println("Nenhuma roupa cadastrada!");
                          } else  {
                              System.out.println("Quantidade para remover: ");
                              int remover = input.nextInt();

                              roupa.removerQuantidade(remover);

                              System.out.println("\nInformações  atualizadas com sucesso!");
                          }

                          break;

                          case 4:
                              if (roupa == null) {
                                  System.out.println("Nenhuma roupa cadastrada!");
                              } else   {
                                  System.out.println("Quantidade para exibir: ");
                              }

                              break;

                              case 0:
                                  System.out.println("Programa finalizado!");
                                  break;
          }

        } while (opcao != 0);
        input.close();



    }
}
