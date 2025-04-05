import java.util.ArrayList;
import java.util.Random;

public class Arena {
    public static void main(String[] args) {
        Random random = new Random();

        // Criar uma Coleção de Objetos para tipo Personagens e outro para tipo Inimigo
        ArrayList<Personagem> listaPersonagem = new ArrayList<>();
        ArrayList<Inimigo> listaInimigo = new ArrayList<>();

        // Criar instância (Objeto) da classe Personagem
        Personagem personagem1 = new Personagem("Yone", 60, 43, 9);
        Personagem personagem2 = new Personagem("Azir", 52, 35, 8);

        // Criar instância (Objeto) da classe Inimigo
        Inimigo inimigo1 = new Inimigo("Nocturne", 60, 40, 10);
        Inimigo inimigo2 = new Inimigo("Ornn", 70, 27, 14);

        // Adicionar Personagem e Inimigo para ArrayList
        listaPersonagem.add(personagem1);
        listaPersonagem.add(personagem2);
        listaInimigo.add(inimigo1);
        listaInimigo.add(inimigo2);

        // Sortear um número aleatório inteiro de acordo com a índice ArrayList
        int escolherPersonagemAleatorio = random.nextInt(0, listaPersonagem.size());
        int escolherInimigoAleatorio = random.nextInt(0, listaInimigo.size());

        // Inserir Personagem e Inimigo escolhido para Batalha
        Batalha arena = new Batalha(listaPersonagem.get(escolherPersonagemAleatorio), listaInimigo.get(escolherInimigoAleatorio));

        // Iniciar Batalha
        arena.iniciarBatalha();

    }

}