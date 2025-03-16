package objeto;

public class Funcionario {
    
    // Atributos
    public String nomeFuncionario;
    public String cargo;
    public String horarioTrabalho;
    public float salario;
    public String tempoContrato;
    public boolean ativo;


    // Métodos
    // Promover o funcionário
    public void promover(String novoCargo, float aumentoSalarial) {
        this.cargo = novoCargo;
        this.salario += aumentoSalarial;

        System.out.println(this.nomeFuncionario + " foi promovida de cargo para " + this.cargo);
        System.out.println("Salário ajustado. R$ " + this.salario);
    }

    // Exibir informações do Funcionário
    public void informacoesFuncionario() {
        System.out.println("\n\nInformações do Funcionário:\n-");
        System.out.println(" Nome Funcionário: " + this.nomeFuncionario);
        System.out.println(" Cargo: " + this.cargo);
        System.out.println(" Horário de Trabalho: " + this.horarioTrabalho);
        System.out.println(" Salário: R$ " + this.salario);
        System.out.println(" Tempo de Contrato: " + this.tempoContrato);

        if (this.ativo == true) { 
            System.out.println(" Situação do Funcionário: " + "Ativo na Empresa\n\n");
        } else {
            System.out.println(" Situação do Funcionário: " + "Desligado da Empresa\n\n");
        }
    }

    // Desligar o funcionário da Empresa
    public void demitir() {
        if (this.ativo == true) {
            this.ativo = false;
            System.out.println("( Funcionário " + this.nomeFuncionario + " desligado da Empresa! )");
        } else {
            System.out.println("( " + this.nomeFuncionario + " já foi desligada da Empresa! )");
        }
    }

    
    public static void main(String[] args) {
        // Criando um objeto da Classe Funcionario
        Funcionario pessoa = new Funcionario();

        // Atribuindo valores ao atributos do Objeto pessoa
        pessoa.nomeFuncionario = "Jéssica";
        pessoa.cargo = "Dev Front-End Jr";
        pessoa.horarioTrabalho = "8h - 18h";
        pessoa.salario = 2750f;
        pessoa.tempoContrato = "1 Ano e 3 meses";
        pessoa.ativo = true;

        // Exibir informações do Funcionário
        pessoa.informacoesFuncionario();

        // Promover o funcionário e Reajuste no contrato
        pessoa.promover("Dev Front-End Pleno", 750);
        pessoa.tempoContrato = "2 Anos";
        
        // Exibir informações atualizada do funcionário
        pessoa.informacoesFuncionario();
        
        // Desligamento do funcionário na empresa
        pessoa.demitir();
        pessoa.informacoesFuncionario();
        pessoa.demitir();
    }
}
