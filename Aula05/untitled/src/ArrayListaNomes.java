import java.util.ArrayList;

public class ArrayListaNomes {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        //Adicionando Valores
        nomes.add("Roberto");
        nomes.add("Isabella");
        nomes.add("Gustavo");
        nomes.add("Bianca");

        //Adionar Valores em posições específicas
        nomes.add(2,"Paulo");
        nomes.add(3,"Vitor");

        //Verificar tamanho da lista
        System.out.println("O tamanho da lista é: " + nomes.size());

        //Acessar o segundo nome da lista
        System.out.println("Segundo nome da lista " + nomes.get(1));

        //Alterar um valor
        nomes.set(1,"Ricardo");
        System.out.println("Segundo nome da lista: " + nomes.get(1));

        //Encontrar uma posição a partir do seu valor
        System.out.println(nomes.indexOf("Roberto"));

        //Remover valores de uma lista
        nomes.remove(1); //Posição
        nomes.remove("Gustavo"); //Valor

        //ForEach
        for(String nome : nomes){
            System.out.println(nome);
        }

        //Funcao Anonima
        nomes.removeIf(nome -> nome.toLowerCase().contains("a"));

        for(String nome : nomes){
            System.out.println(nome);
        }

    }
}
