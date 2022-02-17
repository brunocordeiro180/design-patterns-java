package strategy.com.strategy;

public class NotificacaoDiretorio implements NotificacaoStrategy {
    
    @Override
    public void gerarNotificacao() {
        System.out.println("Gerada notificacao de diretorio");
    }
}
