public class Sistema implements Internet, ReprodutorMusical, TelefoneLigacao {
    public void tocarMusica(){
        System.out.println("Tocando musica");
    }

    public void pausarMusica(){
        System.out.println("Pausando musica");
    }

    public void selecionarMusica(){
        System.out.println("Escolha uma música");
    }

    public void fazerChamada(){
        System.out.println("Ligando....");
    }

    public void atendeChamada(){
        System.out.println("Atendendo....");
    }

    public void correioDeVoz(){
        System.out.println("Correio de voz sendo iniciado");
    }

    public void exibirPagina(){
        System.out.println("Exibindo a pagina");
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }
}
