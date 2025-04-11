import builder.Chamada;
import builder.ChamadaBuilder;
import decorator.*;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        // Criando chamada (Builder)
        Chamada chamada = new ChamadaBuilder()
                .setTurno("Noturno")
                .setAtividade("Descarga de navio")
                .setLocal("Terminal 1")
                .build();

        // Decorando chamada com requisitos extras
        ChamadaBase chamadaDecorada = new ChamadaSimples(chamada.toString());
        chamadaDecorada = new RequisitoEPI(chamadaDecorada);
        chamadaDecorada = new TransporteIncluso(chamadaDecorada);

        System.out.println(chamadaDecorada.getDescricao());

        // Notificando trabalhador (Strategy)
        NotificacaoStrategy notificacao = new NotificacaoApp();
        notificacao.notificar("Nova chamada disponível: " + chamadaDecorada.getDescricao());
    }
}
