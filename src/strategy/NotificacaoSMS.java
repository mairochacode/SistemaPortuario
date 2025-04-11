package strategy;

public class NotificacaoSMS implements NotificacaoStrategy {
    public void notificar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
