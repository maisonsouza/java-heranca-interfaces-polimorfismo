public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario maison = new Funcionario();
        maison.setNome("Maison Galvão");
        maison.setCpf("98225723287");
        maison.setSalario(3000);

        System.out.println(maison.getNome());
        System.out.println(maison.getBonificacao());
    }
}
