import java.util.Scanner;

public class testeaula2{
    public static void main(String[] args){
        System.out.println("Digite o número de publicações");
        Scanner entrada = new Scanner(System.in);
        double npubli= entrada.nextDouble(); 
        
        
        double curtidastotal= 0 ;
        while (npubli< 0){
            System.out.println("Valor inválido, digite outro valor: ");
            npubli = entrada.nextDouble();
        }
        for (int i = 1; i <= npubli; i++){
            
            System.out.println("Digite o número de curtidas");
            double curtidas = entrada.nextDouble();
            curtidastotal += curtidas;
            if (curtidas >= 100){
                System.out.println("Publicalçao popular!");
             }
             else{
                System.out.println("Publicação com poucas curtidas.");
             }

        }

        double media = (double)curtidastotal / npubli;
        System.out.printf("Sua média de curtidas é igual a: %.2f%n", media );
        System.out.printf("Seu total de publicações é igual a: %.2f%n ", npubli);
        entrada.close();

    }
}