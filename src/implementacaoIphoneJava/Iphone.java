package implementacaoIphoneJava;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	private String modelo;
	private String cor;
	
	public Iphone(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exbindo pagina: " + url);
		
	}
	@Override
	public void adicionarNovaAba(String url) {
		System.out.println("Nova aba adicionada: " + url);
		
	}
	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");
		
	}
	@Override
	public void ligar(String numero) {
		System.out.println("Lingando para: " + numero);
		
	}
	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");
		
	}
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
		
	}
	@Override
	public void tocar() {
		System.out.println("Tocando música ...");
		
	}
	@Override
	public void pausar() {
		System.out.println("Musica pausada.");
		
	}
	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada: " + musica);
		
	}
	
	
}
