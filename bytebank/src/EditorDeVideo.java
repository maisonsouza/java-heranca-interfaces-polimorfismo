public class EditorDeVideo extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do editor de vídeo");
        return 150;
    }
}
