import java.util.Scanner;
public class ExemploVetorFuncao{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double [] precos = populaVetor();
        imprime(precos);
        System.out.printf("Valor do Desconto: ");
        double desconto = entrada.nextDouble();
        aplicaDesconto(precos, desconto );
        imprime(precos);
    }

    public static void aplicaDesconto(double[] precos, double desconto){
        for(int i = 0; i < precos.length; i++){
            precos[i]= precos[i] - (precos[i] * desconto/100);
        }
    }



    public static double[] populaVetor(){
        Scanner entrada = new Scanner(System.in);
        double[] precos = new double[5];
        for (int i= 0; i < precos.length; i++){
            System.out.printf("Preco #%d: ", (i + 1));
            precos[i] = entrada.nextDouble();
            
        }
        return precos;    
    }

    public static void imprime(double[] vetor){
        for (int i= 0; i < vetor.length; i++){
            System.out.printf("%8.2f\n", vetor[i]);
        } 
        System.out.println();
    }

}