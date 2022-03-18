class Main {
    public static void main(String[] args) {
        NotificacaoStrategy notificacaoMovimento = new NotificacaoMovimento();
        GeradorNotificacao geradorNotificacao = new GeradorNotificacao(notificacaoMovimento);
        Boolean resultado = geradorNotificacao.criarNotificacao();
        System.out.println(resultado ? "Gerado com sucesso!" : "Erro");
    }
}