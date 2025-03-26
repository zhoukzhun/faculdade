public class Funcionario {
    
    // Atributos da Classe Funcionario
    private String nomeFuncionario;
    private int idadeFuncionario;
    private String tempoContrato;
    private String cargoFuncionario;
    private String intervaloFerias;
    private String empresaAtual;

    // Construtor da Classe Funcionario (sem parâmetros)
    public Funcionario() {
        this("Não cadastrado", 0, "Não cadastrado", "Não cadastrado", "Não cadastrado", "Não cadastrado");
    }

    // Construtor da Classe Funcionario (definir parâmetros)
    public Funcionario(String nomeFuncionario, int idadeFuncionario, String tempoContrato, String cargoFuncionario, String intervaloFerias, String empresaAtual) {
        this.nomeFuncionario = nomeFuncionario;
        this.idadeFuncionario = idadeFuncionario;
        this.tempoContrato = tempoContrato;
        this.cargoFuncionario = cargoFuncionario;
        this.intervaloFerias = intervaloFerias;
        this.empresaAtual = empresaAtual;
    }

    
    // Getters da Classe Funcionario
    public String getNomeFuncionario() {
        return this.nomeFuncionario;
    }

    public int getIdadeFuncionario() {
        return this.idadeFuncionario;
    }
    
    public String getTempoContrato() {
        return this.tempoContrato;
    }

    public String getCargoFuncionario() {
        return this.cargoFuncionario;
    }

    public String getIntervaloFerias() {
        return this.intervaloFerias;
    }

    public String getEmpresaAtual() {
        return this.empresaAtual;
    }


    // Setters da Classe Funcionario
    public void setNomeFuncionario(String nomeFuncionario) {
        if (nomeFuncionario.trim().length() <= 0) {
            System.out.println("Nome de funcionário inválido, tente novamente!\n");
            this.nomeFuncionario = "Não cadastrado";
        } else {
            System.out.println("Nome do funcionário alterado com sucesso!\n");
            this.nomeFuncionario = nomeFuncionario;
        }
    }

    public void setIdadeFuncionario(int idadeFuncionario) {
        if (idadeFuncionario < 0) {
            System.out.println("Idade inválida, digite uma idade acima ou igual a zero!\n");
        } else {
            System.out.println("Idade do funcionário alterado com sucesso!\n");
            this.idadeFuncionario = idadeFuncionario;
        }
    }

    public void setTempoContrato(String tempoContrato) {
        if (tempoContrato.trim().length() <= 3) {
            System.out.println("Especifique o tempo de Contrato em texto. Tente novamente!\n");
            this.tempoContrato = "Nenhum tempo de contrato mencionado!";
        } else {
            System.out.println("Tempo de contrato alterado com sucesso!\n");
            this.tempoContrato = tempoContrato;
        }
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        if (cargoFuncionario.trim().isEmpty() || cargoFuncionario.length() <= 3) {
            System.out.println("Preencha um cargo existente, tente novamente!\n");
        } else {
            System.out.println("Cargo do funcionário adicionado com sucesso!\n");
            this.cargoFuncionario = cargoFuncionario;
        }
    }

    public void setIntervaloFerias(String intervaloFerias) {
        if (intervaloFerias.trim().isEmpty()) {
            System.out.println("Intervalo de férias inválida, tente novamente!\n");
        } else {
            System.out.println("Intervalo de férias implementado com sucesso!\n");
            this.intervaloFerias = intervaloFerias;
        }
    }

    public void setEmpresaAtual(String empresaAtual) {
        if (empresaAtual.isEmpty()) {
            System.out.println("Empresa inválida, digite a empresa novamente! (Nome da Empresa não pode estar em branco)\n");
            this.empresaAtual = "";
        } else {
            System.out.println("Empresa registrado com sucesso!");
            this.empresaAtual = empresaAtual; 
        }
    }


    // Método para exibir informações gerais do Funcionário
    public void exibirFuncionario() {
        System.out.println("- ".repeat(20) + "\nExibição das informações do Funcionário:\n");
        System.out.println("Nome do Funcionário: " + this.nomeFuncionario);
        System.out.println("Idade do Funcionário: " + this.idadeFuncionario);
        System.out.println("Tempo de Contrato: " + this.tempoContrato);
        System.out.println("Cargo Funcionário: " + this.cargoFuncionario);
        System.out.println("Intervalo de Férias: " + this.intervaloFerias);

        if (this.empresaAtual == "") {
            System.out.println("Empresa atual: não cadastrado");
        } else {
            System.out.println("Empresa Atual: " + this.empresaAtual);
        }

        System.out.println("- ".repeat(20));
    }

    // Método para exibir se o Funcionário esta apto a trabalhar
    public void aptoTrabalhar() {
        if (this.empresaAtual.isEmpty()) {
            System.out.println("Não está apto a trabalhar, pois não possui registro com nenhuma empresa no momento!\n");
        } else {
            System.out.println("Apto a trabalhar, pois está registrado na empresa " + this.empresaAtual);
        }
    }
    
}
