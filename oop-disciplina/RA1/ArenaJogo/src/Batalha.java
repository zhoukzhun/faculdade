import java.util.Random;

public class Batalha {
    // Atributos (Objetos)
    private Personagem personagemEscolhido;
    private Inimigo inimigoEscolhido;

    // Construtor com parâmetros
    public Batalha(Personagem personagemEscolhido, Inimigo inimigoEscolhido) {
        this.personagemEscolhido = personagemEscolhido;
        this.inimigoEscolhido = inimigoEscolhido;
    }

    // Metodo para iniciar Batalha
    public void iniciarBatalha() {

        // Exibir Status do Personagem e Inimigo antes de iniciar a Batalha
        this.statusBatalha(personagemEscolhido, inimigoEscolhido);
        System.out.println("- ".repeat(25) + "\n\t\tPreparar para Batalha!\n");

        // Gerar valor booleano
        // Para true, turno Personagem. Para false, turno do Inimigo
        Random random = new Random();
        boolean turnoAtacar = random.nextBoolean();

        // Contagem de turno inicial
        int numeroTurno = 1;

        // Iniciar Batalha
        while (personagemEscolhido.getVida() > 0 && inimigoEscolhido.getVida() > 0) {
            System.out.println("  ->    [Turno " + numeroTurno + "]");

            if (turnoAtacar) {
                int danoCausado = (personagemEscolhido.getAtaque() - inimigoEscolhido.getDefesa());
                int vidaRetirada = inimigoEscolhido.getVida() - danoCausado;

                if (vidaRetirada < 0) {
                    vidaRetirada = 0;
                }
                inimigoEscolhido.setVida(vidaRetirada);

                System.out.println(personagemEscolhido.getNome() + " atacou " + inimigoEscolhido.getNome() + " causando (" + danoCausado + ") DANO");
                System.out.println("Vida restante do inimigo (" + inimigoEscolhido.getNome() + "): " + inimigoEscolhido.getVida() + "\n\n");
                turnoAtacar = false;

            } else {
                int danoCausado = (inimigoEscolhido.getAtaque() - personagemEscolhido.getDefesa());
                int vidaRetirada = personagemEscolhido.getVida() - danoCausado;

                if (vidaRetirada < 0) {
                    vidaRetirada = 0;
                }
                personagemEscolhido.setVida(vidaRetirada);

                System.out.println(inimigoEscolhido.getNome() + " atacou " + personagemEscolhido.getNome() + " causando (" + danoCausado + ") DANO");
                System.out.println("Vida restante do personagem (" + personagemEscolhido.getNome() + "): " + personagemEscolhido.getVida() + "\n\n");
                turnoAtacar = true;
            }
            numeroTurno++;
        }

        System.out.println("- ".repeat(25));

        if (personagemEscolhido.getVida() <= 0) {
            System.out.println("O inimigo (" + inimigoEscolhido.getNome() + ") venceu a BATALHA!");
        } else {
            System.out.println("O personagem (" + personagemEscolhido.getNome() + ") venceu a BATALHA!");
        }

    }

    // Metodo para exibir Status do Personagem e Inimigo que se enfrentarão na Arena
    private void statusBatalha(Personagem statusPersonagem, Inimigo statusInimigo) {

        System.out.println("\n- -  Personagem (" + statusPersonagem.getNome() + ")  - -");
        System.out.println("Nome: " + statusPersonagem.getNome());
        System.out.println("Vida: " + statusPersonagem.getVida());
        System.out.println("Ataque: " + statusPersonagem.getAtaque());
        System.out.println("Defesa: " + statusPersonagem.getDefesa());

        System.out.println("\n- -  Inimigo (" + statusInimigo.getNome() + ")  - -");
        System.out.println("Nome: " + statusInimigo.getNome());
        System.out.println("Vida: " + statusInimigo.getVida());
        System.out.println("Ataque: " + statusInimigo.getAtaque());
        System.out.println("Defesa: " + statusInimigo.getDefesa());

    }

}