package Lista05;

public class Pessoa {
    String nome;
    int idade;
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public static void main(String[]args){
        Pessoa p1 = new Pessoa("Gabriel", 20);
        Pessoa p2 = new Pessoa("Luísa", 20);
        System.out.println("Nome: "+ p1.nome);
        System.out.println("Nome: "+ p1.idade);
        System.out.println("Nome: "+ p2.nome);
        System.out.println("Nome: "+ p2.idade);
    }

}
