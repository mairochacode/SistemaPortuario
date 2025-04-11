package decorator;

public class ChamadaSimples implements ChamadaBase {
    private String descricao;

    public ChamadaSimples(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
