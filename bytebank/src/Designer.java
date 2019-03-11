public class Designer extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método do designer");
        return 200;
    }
}
