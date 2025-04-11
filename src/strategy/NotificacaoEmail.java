package strategy;

public class NotificacaoEmail implements NotificacaoStrategy {
    public void notificar(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
}
