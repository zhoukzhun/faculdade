import java.util.ArrayList;
import java.util.Scanner;


public class Tarefa_lista {

    // Função que retorna uma lista de números inteiros
    static ArrayList<Integer> valores_lista_aleatorio(int quantidade_numeros) {

        // Gerar uma lista vazia 
        ArrayList<Integer> lista = new ArrayList<>();

        // Gerar números inteiros e adicionando ao lista
        for (int inicio = 0; inicio < quantidade_numeros; inicio++) {
            int numero_gerado = (int) (Math.random() * 101);
            lista.add(numero_gerado);
        }   

        return lista;
    }
    

    public static void main(String[] args) {
        // Criando um objeto para Input do tipo inteiro
        Scanner quantidade_numero_lista = new Scanner(System.in);

        // Ler os dados inteiros (input)
        System.out.println("Digite a quantidade de números que deseja gerar para uma lista: ");
        int ler_quantidade_numero = quantidade_numero_lista.nextInt();

        // Retornar uma lista com os números inteiros
        ArrayList<Integer> lista_gerado = valores_lista_aleatorio(ler_quantidade_numero);
        quantidade_numero_lista.close();
        System.out.println("\nLista gerado: " + lista_gerado + "\n");
        
        for (int analisar_num : lista_gerado) {
            // Analisar se o número é múltiplo de 3
            if (analisar_num % 3 == 0) {
                System.out.println("O número " + analisar_num + " é múltiplo de 3");
            } else {
                System.out.println("O número " + analisar_num + " não é múltiplo de 3");
            }

            // Analisar se o número é par ou ímpar
            if (analisar_num % 2 == 0) {
                System.out.println("O número " + analisar_num + " é par!\n");
            } else {
                System.out.println("O número " + analisar_num + " não é par!\n");
            }
        }

    }
}
