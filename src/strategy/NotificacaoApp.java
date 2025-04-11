package strategy;

public class NotificacaoApp implements NotificacaoStrategy {
    public void notificar(String mensagem) {
        System.out.println("Enviando pelo App: " + mensagem);
    }
}
