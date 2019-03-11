public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(123,123);
        cc1.deposita(1000);
        ContaPoupanca cp = new ContaPoupanca(11,11);
        System.out.println(cc1.getSaldo());
        System.out.println(cp.getSaldo());
        cp.deposita(500);
        System.out.println(cc1.getSaldo());
        System.out.println(cp.getSaldo());
        cc1.transfere(100,cp);
        System.out.println(cc1.getSaldo());
        System.out.println(cp.getSaldo());
        cp.saca(200);
        System.out.println(cc1.getSaldo());
        System.out.println(cp.getSaldo());
        cc1.saca(100);
        System.out.println(cc1.getSaldo());
        System.out.println(cp.getSaldo());

    }
}
