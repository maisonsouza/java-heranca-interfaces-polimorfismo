public class Gerente extends Funcionario implements Autenticavel {

    AutenticacaoUtil autenticador;

    public Gerente (){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return autenticador.autentica(senha);
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() ;
    }
}
