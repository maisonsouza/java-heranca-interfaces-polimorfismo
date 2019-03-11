public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario maison = new Gerente();
        maison.setNome("Maison Galvão");
        maison.setCpf("98225723287");
        maison.setSalario(2600);

        System.out.println(maison.getNome());
        System.out.println(maison.getBonificacao());
    }
}
