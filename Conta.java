public abstract class Conta implements IConta { /*A classe abstrata não pode ser instanciada e nesse casso faz sentido, porque a classe conta é uma classe mãe e só faz sentido "dar um new" em uma classe ContaPoupança ou ContaCorrente.*/

    public int agencia;
    public int numero;
    public double saldo;



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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void transferir(double valor, Conta Destino) {
        // TODO Auto-generated method stub
        
    }
    
    

    
}
