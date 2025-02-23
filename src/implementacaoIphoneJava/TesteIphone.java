package implementacaoIphoneJava;

public class TesteIphone {
    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone("iPhone 12", "Preto");

        // Testando Reprodutor Musical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");

        // Testando Aparelho Telefônico
        meuIPhone.ligar("1234-5678");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuIPhone.exibirPagina("https://www.google.com");
        meuIPhone.adicionarNovaAba("https://www.apple.com");
        meuIPhone.atualizarPagina();
    }
}
