public class Dinheiro {
    ICotacao cotacao;
    CotacaoAdapter persistencia;

    public Dinheiro() {
        cotacao = new CotacaoReal();
        persistencia = new CotacaoAdapter(cotacao);
    }

    public void setDinheiro(float dinheiro) {
        cotacao.setDinheiro(dinheiro);
        persistencia.RealToDolar();
    }

    public float getDinheiro() {
        return persistencia.DolarToReal();
    }

    public float getDolar() {
        return persistencia.getDinheiro();
    }
}
