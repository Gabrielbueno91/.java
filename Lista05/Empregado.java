package Lista05;
import java.util.Scanner;
public class Empregado {
    
    String nome;
    String funcao;
    double salario;
    public Empregado(String nome, String funcao, double salario){
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public double atualizarSalario(double novoSalario){
        return salario = novoSalario;
    }

    public double percentualAumento(double aumento){
        return salario += salario *(aumento/100);
    }

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nome = entrada.nextLine(); 
        System.out.println("Digite a função: ");
        String funcao = entrada.nextLine(); 
        System.out.println("Digite o salário: ");
        double salario = entrada.nextDouble();
        Empregado e1 = new Empregado(nome, funcao, salario);
        System.out.println("Informe o percentual de aumento: ");
        double aumento = entrada.nextDouble();
        System.out.println("Nome: "+ e1.nome);
        System.out.println("Salario: "+ e1.atualizarSalario(salario));
        System.out.println("Função: "+ e1.funcao);
        System.out.println("O novo salário de " + nome +"será de "+ e1.percentualAumento(aumento));
        


    }
}
