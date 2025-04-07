import java.util.Scanner;
public class exercicio1{
    public static void main(String[] args){
        double valorFinal = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o preço na etiqueta: ");
        int PE = entrada.nextInt();
        System.out.println("Digite o código de condição de pagamento: ");
        System.out.println("CÓDIGO CONDIÇÃO DE PAGAMENTO");
        System.out.println("1 À vista em dinheiro ou cheque, com 10% de desconto");
        System.out.println("2 À vista com cartão de crédito, com 5% de desconto");
        System.out.println("3 Em 2 vezes, preço normal de etiqueta sem juros");
        System.out.println("4 Em 3 vezes, preço de etiqueta com acréscimo de 10%");
        int CP = entrada.nextInt();
        switch (CP) {
            case 1:
                System.out.println("1 À vista em dinheiro ou cheque, com 10% de desconto");
                valorFinal = PE * 0.9;
                System.out.println("O valor final é igual á: " + valorFinal);
                break;
            case 2:
                System.out.println("2 À vista com cartão de crédito, com 5% de desconto");
                valorFinal = PE * 0.5;
                System.out.println("O valor final é igual á: " + valorFinal);
                break;
            case 3:
                System.out.println("3 Em 2 vezes, preço normal de etiqueta sem juros");
                valorFinal = PE;
                System.out.println("O valor final é igual a: " + valorFinal +  "\ndividido em 2 vezes de " + (valorFinal/2));
                break;
            case 4:
                System.out.println("4 Em 3 vezes, preço de etiqueta com acréscimo de 10");
                valorFinal = PE * 1.1;
                System.out.println("O valor final é igual a: " + valorFinal +  "\ndividido em 3 vezes de " + (valorFinal/3));
                break;
        }
    }
}