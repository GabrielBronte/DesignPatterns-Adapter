public class CotacaoAdapter extends CotacaoDolar{
    private ICotacao dinheiroDolar;

    public CotacaoAdapter(ICotacao valorDolar) {
        this.dinheiroDolar = valorDolar;
    }

    public float DolarToReal(){
        dinheiroDolar.setDinheiro(this.getDinheiro() * (float)5.53);
        return dinheiroDolar.getDinheiro();
    }

    public void RealToDolar(){
        this.setDinheiro((float) (dinheiroDolar.getDinheiro() / 5.53));
    }
}
