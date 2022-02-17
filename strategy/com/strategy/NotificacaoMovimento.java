package strategy.com.strategy;

public class NotificacaoMovimento implements NotificacaoStrategy {
    
    @Override
    public void gerarNotificacao() {
        System.out.println("Gerada notificacao de movimento");
    }
}
