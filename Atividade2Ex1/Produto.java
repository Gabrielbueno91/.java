package Atividade2Ex1;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal(){
        return (double) preco * quantidade;
    }
     public void aplicarDesconto(double percentual){
        preco -= preco * (percentual/100);
     }

     public void exibirInformacoes(){
        System.out.println("Produto: "+ nome);
        System.out.println("Preço: "+ preco);
        System.out.println("Quantidade: "+ quantidade);
        System.out.println("Valor de estoque: "+ calcularValorTotal());
        
     }

     public static void main(String[] args){
        Produto p1 = new Produto("Bicicleta", 1999.99, 27);
        p1.aplicarDesconto(10);
        p1.exibirInformacoes();


     }
}
