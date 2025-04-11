package builder;

public class Chamada {
    private String turno;
    private String atividade;
    private String local;

    public Chamada(String turno, String atividade, String local) {
        this.turno = turno;
        this.atividade = atividade;
        this.local = local;
    }

    public String toString() {
        return "Chamada para " + atividade + " no turno " + turno + " no local " + local;
    }
}
