package Atividade2Ex1;

public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;
    
    public ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor > 0 ){// foi necessário o if, pois caso o valor fosse negativo, iria inverter os sinais
            saldo += valor;
            System.out.println("O deposito de: "+ valor +" foi realizado.");
        }
        else{
            System.out.println("Valor inválido ");
        }
    }
    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("O saque de: "+ valor +" foi realizado.");
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
     public void exibirSaldo(){
        System.out.println("Saldo: "+ saldo);
     }
     

     public static void main(String[]args){
        ContaBancaria conta  = new ContaBancaria("10294716" , "Gabriel Bueno Fernandes", 871999 );

        conta.exibirSaldo();
        conta.depositar(1);
        conta.sacar(10000000);
        conta.exibirSaldo();
     }

}
