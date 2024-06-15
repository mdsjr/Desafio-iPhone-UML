public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private Musica musicaAtual;
    private boolean tocando;

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        if (musicaAtual != null) {
            tocando = true;
            System.out.println("Tocando música: " + musicaAtual.getTitulo() + " - " + musicaAtual.getArtista());
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("Música pausada.");
        } else {
            System.out.println("Nenhuma música está tocando.");
        }
    }

    @Override
    public void selecionarMusica(String titulo) {
        // Aqui você pode adicionar lógica para selecionar uma música da biblioteca
        // Por simplicidade, vamos criar uma música fictícia
        musicaAtual = new Musica(titulo, "Artista Desconhecido", 300);
        System.out.println("Música selecionada: " + musicaAtual.getTitulo() + " - " + musicaAtual.getArtista());
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        // Testando ReprodutorMusical
        meuIPhone.selecionarMusica("Minha Música Favorita");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // Testando AparelhoTelefonico
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIPhone.exibirPagina("http://www.exemplo.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
