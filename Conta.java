public abstract class Conta implements IConta {
    
    /*A classe abstrata não pode ser instanciada e nesse caso faz sentido, porque a classe conta é uma classe mãe e só faz sentido "dar um new" em uma classe ContaPoupança ou ContaCorrente.*/


    private static int SEQUENCIAL = 0;
    protected int agencia;
    protected int numero;
    protected double saldo;
    private static final int AGENCIA_PADRAO = 0001;
    private Cliente cliente;



    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }




    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
        
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
        
    }

    @Override
    public void transferir(double valor, IConta Destino) {
        this.sacar(valor);
        Destino.depositar(valor);
        
    }

    
    public void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s ", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d ", this.agencia));
        System.out.println(String.format("Conta: %d ", this.numero));
        System.out.println(String.format("Saldo: %.2f ", this.saldo));
    }

    
    

    
}
