public class Interface {
    // Atributos
    private String opc1;
    private String opc2;
    private String opc3;
    private String opc4;
    private String opc5;
    private String opc6;
    private String opc7;

    // Construtor com parâmetros
    public Interface(String opc1, String opc2, String opc3, String opc4, String opc5, String opc6, String opc7) {
        this.opc1 = opc1;
        this.opc2 = opc2;
        this.opc3 = opc3;
        this.opc4 = opc4;
        this.opc5 = opc5;
        this.opc6 = opc6;
        this.opc7 = opc7;
    }

    // Metodo para exibir a tela de Interface
    public void exibirTela() {
        System.out.println("- ".repeat(20));
        System.out.println("[1] " + this.opc1);
        System.out.println("[2] " + this.opc2);
        System.out.println("[3] " + this.opc3);
        System.out.println("[4] " + this.opc4);
        System.out.println("[5] " + this.opc5);
        System.out.println("[6] " + this.opc6);
        System.out.println("[7] " + this.opc7);
        System.out.println("- ".repeat(20));
    }
}
