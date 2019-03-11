public class ContaCorrente extends Conta implements Tributavel{


    public ContaCorrente(int agencia, int numero){
        super(agencia,numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorASerSacado = valor + 0.20;
        return super.saca(valorASerSacado);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }
}
