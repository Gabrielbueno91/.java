//Nome de classe sempre letra maiúscula
public class Aluno{
    //Atributos
    String nome;
    double nota1;
    double nota2;

    //construtor
    public Aluno(String nome){
        this.nome = nome;
    }
    
    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // métodos
    public double calculaMedia(){
        double soma = nota1 + nota2;
        return soma / 2;
    }

}