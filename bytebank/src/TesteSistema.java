public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(1111);
        Administrador adm = new Administrador();
        adm.setSenha(1111);
        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
    }

}
