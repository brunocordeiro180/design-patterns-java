public class GeradorNotificacao {

    NotificacaoStrategy strategy;

    GeradorNotificacao(NotificacaoStrategy notificacaoStrategy){
        this.strategy = notificacaoStrategy;
    }

    public Boolean criarNotificacao(){
        
        try{
            this.strategy.gerarNotificacao();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
        return true;
    }
}
