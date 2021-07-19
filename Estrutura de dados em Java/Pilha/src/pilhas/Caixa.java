package pilhas;

public class Caixa {
    private int dado;
    private Caixa refCaixa = null;

    public Caixa() {
    }

    public Caixa(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Caixa getRefCaixa() {
        return refCaixa;
    }

    public void setRefCaixa(Caixa refCaixa) {
        this.refCaixa = refCaixa;
    }

    @Override
    public String toString() {
        return "Caixa{" +
                "dado=" + dado +
                '}';
    }
}
