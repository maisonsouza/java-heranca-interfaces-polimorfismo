public class Gerente extends Funcionario implements Autenticavel {

    @Override
    public void setSenha(int senha) {

    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() ;
    }
}
