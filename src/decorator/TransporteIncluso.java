package decorator;

public class TransporteIncluso extends ChamadaDecorator {
    public TransporteIncluso(ChamadaBase chamada) {
        super(chamada);
    }

    public String getDescricao() {
        return chamada.getDescricao() + " | Transporte incluso";
    }
}
