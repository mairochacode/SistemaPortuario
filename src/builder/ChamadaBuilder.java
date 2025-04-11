package builder;

public class ChamadaBuilder {
    private String turno;
    private String atividade;
    private String local;

    public ChamadaBuilder setTurno(String turno) {
        this.turno = turno;
        return this;
    }

    public ChamadaBuilder setAtividade(String atividade) {
        this.atividade = atividade;
        return this;
    }

    public ChamadaBuilder setLocal(String local) {
        this.local = local;
        return this;
    }

    public Chamada build() {
        return new Chamada(turno, atividade, local);
    }
}
