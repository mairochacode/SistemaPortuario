package decorator;

public abstract class ChamadaDecorator implements ChamadaBase {
    protected ChamadaBase chamada;

    public ChamadaDecorator(ChamadaBase chamada) {
        this.chamada = chamada;
    }
}
