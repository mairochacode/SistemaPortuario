package decorator;

public class RequisitoEPI extends ChamadaDecorator {
    public RequisitoEPI(ChamadaBase chamada) {
        super(chamada);
    }

    public String getDescricao() {
        return chamada.getDescricao() + " | EPI obrigatório";
    }
}
