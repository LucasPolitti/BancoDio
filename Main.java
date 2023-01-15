public class Main {

    public static void main(String[] args) {

        Cliente Venilton = new Cliente();
        Venilton.setNome("Venilton");

        ContaCorrente cc = new ContaCorrente(Venilton);
        cc.depositar(100);
        ContaPoupanca poupanca = new ContaPoupanca(Venilton);

        cc.transferir(50, poupanca);

        cc.imprimirInfosComuns();
        poupanca.imprimirInfosComuns();





        





    }
    
}
