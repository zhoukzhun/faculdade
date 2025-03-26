public class Estacionamento {
    
    // Atributos da Classe Estacionamento
    private String modeloCarro;
    private int anoCarro;
    private String tipoCliente;
    private float precoUso;
    private String tamanhoVaga;

    // Construtor da Classe Estacionamento (sem definição de parâmetros)
    public Estacionamento() {
        this.modeloCarro = "Não inserido";
        this.anoCarro = 0;
        this.tipoCliente = "Não inserido";
        this.precoUso = 0;
        this.tamanhoVaga = "Não inserido";
    }

    // Construtor da Classe Estacionamento (com definição de parâmetros)
    public Estacionamento(String modeloCarro, int anoCarro, String tipoCliente, float precoUso, String tamanhoVaga) {
        this.modeloCarro = modeloCarro;
        this.anoCarro = anoCarro;
        this.tipoCliente = tipoCliente;
        this.precoUso = precoUso;
        this.tamanhoVaga = tamanhoVaga; 
    }


    // Getters (Atributos)
    public String getModeloCarro() {
        return this.modeloCarro;
    }

    public int getAnoCarro() {
        return this.anoCarro;
    }

    public String getTipoCliente() {
        return this.tipoCliente;
    }

    public float getPrecoUso() {
        return this.precoUso;
    }

    public String getTamanhoVaga() {
        return this.tamanhoVaga;
    }


    // Setters (Atributos)
    public void setModeloCarro(String modeloCarro) {
        if (modeloCarro.isEmpty() || modeloCarro.length() <= 2) {
            System.out.println("Espefique em detalhes o Modelo de Carro novamente!");
        } else {
            this.modeloCarro = modeloCarro;
        }
    }

    public void setAnoCarro(int anoCarro) {
        if (anoCarro <= 1) {
            System.out.println("Digite um ano válido do Carro que quer manter estacionado!");
        } else {
            this.anoCarro = anoCarro;
        }
    }

    public void setTipoCliente(String tipoCliente) {
        if (tipoCliente == "mensalista") {
            this.tipoCliente = "Mensalista";
        } else if (tipoCliente == "temporário" || tipoCliente == "temporario"){
            this.tipoCliente = "Temporário";
        } else {
            System.out.println("Tipo de Cliente inválido, aceitamos somente Mensalista ou Temporário!\n");
        }
    }

    public void setPrecoUso(float precoUso) {
        if (precoUso < 0) {
            System.out.println("Preço colocado foi negativo, tente novamente!");
        } else {
            this.precoUso = precoUso;
        }
    }

    public void setTamanhoVaga(String tamanhoVaga) {
        if (tamanhoVaga.equals("pequeno")) {
            this.tamanhoVaga = "Vaga Pequeno";
        } else if (tamanhoVaga.equals("médio") || tamanhoVaga.equals("medio")) {
            this.tamanhoVaga = "Vaga Médio";
        } else if (tamanhoVaga.equals("grande")) {
            this.tamanhoVaga = "Vaga Grande";
        } else {
            System.out.println("Não existe esse tamanho de vaga, insira novamente (pequeno, médio ou grande)");
            this.tamanhoVaga = "Não inserido";
        }
    }


    // Método para exibir as informações do Carro que está no Estacionamento
    public void extratoClienteEstacionamento() {
        System.out.println("\n\n" + "- ".repeat(20) + "\nExtrato Usuário (Estacionamento):\n-");
        System.out.println("Modelo do Carro: " + this.modeloCarro);
        System.out.println("Ano do carro: " + this.anoCarro);
        System.out.println("Tipo de cliente: " + this.tipoCliente);
        System.out.println("Preço Uso R$ " + this.precoUso);
        System.out.println("Tamanho da Vaga: " + this.tamanhoVaga);
        System.out.println("- ".repeat(20));
    }

}

