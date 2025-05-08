public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Testando o Reprodutor Musical
        iphone.selecionarMusica("Shape of You");
        iphone.tocar();
        iphone.pausar();

        // Testando o Aparelho Telefônico
        iphone.ligar("123-456-789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando o Navegador de Internet
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
