public class Interface {
    
    private String opcao1;
    private String opcao2;
    private String opcao3;
    private String opcao4;
    private String opcao5;
    private String opcao6;
    private String opcao7;

    public Interface(String opcao1, String opcao2, String opcao3, String opcao4, String opcao5, String opcao6, String opcao7) {
        this.opcao1 = opcao1;
        this.opcao2 = opcao2;
        this.opcao3 = opcao3;
        this.opcao4 = opcao4;
        this.opcao5 = opcao5;
        this.opcao6 = opcao6;
        this.opcao7 = opcao7;
    }

    public void getmenuGeral() {
        System.out.println("- ".repeat(20));
        System.out.println("(1) " + opcao1.toLowerCase());
        System.out.println("(2) " + opcao2.toLowerCase());
        System.out.println("(3) " + opcao3.toLowerCase());
        System.out.println("(4) " + opcao4.toLowerCase());
        System.out.println("(5) " + opcao5.toLowerCase());
        System.out.println("(6) " + opcao6.toLowerCase());
        System.out.println("(7) " + opcao7.toLowerCase());
        System.out.println("- ".repeat(20));
    }

}
