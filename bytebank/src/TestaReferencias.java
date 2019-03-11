public class TestaReferencias {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000);

        Funcionario editor = new EditorDeVideo();
        editor.setSalario(2500);

        Funcionario designer = new Designer();
        designer.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(editor);
        controle.registra(designer);

        String nome = g1.getNome();
        System.out.println(nome);
        System.out.println(controle.getSoma());
    }
}
