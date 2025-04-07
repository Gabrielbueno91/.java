// Gabriel Bueno Fernandes RA:10726498
//Leonardo Favaron Pereira RA: 10436308
//Melissa Zanelato Lupinacci RA:10436651


import java.util.Scanner;
import java.util.Random;

public class OperacaoVetores{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int [] vetor = null;
        while (true){
            System.out.println("\n1. Inicializar o vetor com números aleatórios;");
            System.out.println("2. Imprimir o vetor;");
            System.out.println("3. Verificar se um determinado número está contido no vetor;") ;              
            System.out.println("4. Buscar o maior número armazenado no vetor;");                 
            System.out.println("5. Calcular a média dos números pares armazenados no vetor;");                
            System.out.println("6. Calcular o percentual dos números ímpares armazenados no vetor;");                    
            System.out.println("7. Calcula a média centralizada dos números armazenados no vetor;");                  
            System.out.println("8. Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado.");                   
            int menu = entrada.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Digite o tamanho do vetor: ");
                    int N = entrada.nextInt();
                    System.out.print("Informe o valor máximo dos números (M): ");
                    int M = entrada.nextInt();
                    vetor = new int[N];
                    for (int i = 0; i < N; i++) {
                        vetor[i] = aleatorio.nextInt(M) + 1; // Gera número de 1 até M
                    }
                    break;
                case 2:
                    if (vetor == null) {//usamos o If e else em todos os cases a partir da 2, para nos dar certeza que só irá funcionar caso o vetor esteja criado, (automaticamente a opção 1 foi selecionada)
                        System.out.println("O vetor ainda não foi inicializado. Escolha a opção 1 primeiro.");
                    } else {
                        impressao(vetor); // Chama a função de imprimir
                    }
                    break;
                case 3:
                    if (vetor == null) {
                        System.out.println("O vetor ainda não foi inicializado. Escolha a opção 1 primeiro.");
                    } else {
                        System.out.println("Digite o número que deve ser verificado: "); 
                        int verificado = entrada.nextInt();
                        verificarN(vetor, verificado);// chama função de verificar se o valor está no vetor.
                        int resultadoVer = verificarN(vetor, verificado);
                        if (resultadoVer != -1){
                            System.out.println("O valor foi verificado e encontrado. ");
                        }
                        else{
                            System.out.println("O Valor foi verificado e não foi encontrado.");
                        }
                    }
                    break;
                case 4:
                    if (vetor == null) {
                        System.out.println("O vetor ainda não foi inicializado. Escolha a opção 1 primeiro.");
                    } else {
                        buscarMaior(vetor);// Chama função que busca maior valor do vetor.
                        int maiorIdx = buscarMaior(vetor);
                        System.out.println("O maior elemento encontrado foi: "+ maiorIdx);
                    }
                    break;
                case 5:
                    if (vetor == null) {
                        System.out.println("O vetor ainda não foi inicializado. Escolha a opção 1 primeiro.");
                    } else {
                        mediaPares(vetor);// Chama funcão que faz a média de números pares.
                        double mediaPares = mediaPares(vetor);
                        if(mediaPares > 0){
                            System.out.println("A média encontrada foi: "+ mediaPares);
                        }
                        else{
                            System.out.println("Não existiam pares.");
                        }


                    }
                    break;
                case 6 :
                    if (vetor == null) {
                        System.out.println("O vetor ainda não foi inicializado. Escolha a opção 1 primeiro.");
                    } else {
                        percentualImpar(vetor); 
                        double percentualImp = percentualImpar(vetor);//Chama função da porcentagem de ímpares
                        if(percentualImp > 0){
                            System.out.println("A média encontrada foi: "+ percentualImp+"%");
                        }
                        else{
                            System.out.println("Não existiam ímpares.");
                        }
                    }
                    break;
                case 7 :
                    if (vetor == null) {
                        System.out.println("O vetor ainda não foi inicializado. Escolha a opção 1 primeiro.");
                    } else {
                        mediaCentralizada(vetor);
                        double mediaCent = mediaCentralizada(vetor);//Chama função da média centralizada, ignorando o maior e menor valor
                        if(mediaCent > 0){ // se tiver mais de 2 elementos vem para cá
                            System.out.println("A média centralizada encontrada foi: "+ mediaCent);
                        }
                        else{// Se tiver 2 ou menor elementos, vem para cá
                            System.out.println("Não existiam números suficientes no vetor.");
                        }
                    }
                    break;
                case 8 :
                    if (vetor == null) {
                        System.out.println("O vetor ainda não foi inicializado. Escolha a opção 1 primeiro.");
                    } else {
                        System.out.println("Digite o número para verificar: "); 
                        double valorVerificado= entrada.nextDouble();
                        verificaSoma(vetor, valorVerificado);
                        boolean somaVerificada = verificaSoma(vetor, valorVerificado);
                        if (somaVerificada == true){//Condição if, para caso a Função retorne true
                            System.out.println("Existe um par de elementos onde somados se igualam a: "+ valorVerificado);
                        }
                        else{
                            System.out.println("Não existe um par que some: "+ valorVerificado);
                        }



                    }
                    break;
                default:
                    System.out.println("Opcão inválida");
            }
                
               
        }
    }
    public static void impressao(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+ " ");
        }
    }
    public static int verificarN(int[] vetor, int verificado ) {
        for (int i = 0; i <vetor.length; i++){
            if (vetor[i] == verificado){
                return i;
            }  
        }
            return -1;
            
        
    } 
    public static int buscarMaior(int[] vetor){
        int maiorN = 0;
        for (int i = 0; i <vetor.length; i++){
            if(vetor[i] > maiorN){//começa em 0 e sempre que aparece algum valor maior ele irá substituir o vetor
               maiorN = vetor[i];
            }
        }
        return maiorN;
    }
    public static double mediaPares(int[] vetor){
        double acumuladorPares =0;
        double pares = 0;
        double mediaPares = 0; 
        for (int i = 0 ; i < vetor.length; i++){
            if (vetor[i] % 2 == 0 ){// % (operador matemático para resto de divisão)
                acumuladorPares ++ ;
                pares += vetor[i];
                

            }
            
        }
        if (acumuladorPares > 0){
            mediaPares = pares/acumuladorPares;
            return mediaPares;
        }
        else{
            return 0;
        }
    }
    public static double percentualImpar(int[] vetor){
        double acumulador = 0;
        double acumuladorImpar = 0;
        double porcentagemImp = 0;
        for(int i =0; i < vetor.length ; i++ ){
            acumulador ++;
            if(vetor[i] % 2 > 0){
                acumuladorImpar ++;
            }
        }

        if (acumuladorImpar > 0){
            porcentagemImp = (acumuladorImpar / acumulador)*100 ;// Cálculo para descobrir porcentagem;
            return porcentagemImp;
        }
        else{
            return 0;// return fora do for para garantir que algum valor será retornado
        }
    }
    public static double mediaCentralizada(int[] vetor){
        if (vetor.length <= 2) {// caso o vetor tenha 2 ou menos elementos, impedindo de fazer média centralizada
            return 0;
        }
    
        // Encontra o menor e o maior
        int menor = vetor[0];// igual a posição 0 do vetor, pois caso se igualasse a 0 sempre ia ser 0 o menor
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) menor = vetor[i];
            if (vetor[i] > maior) maior = vetor[i];
        }
    
        int soma = 0;
        int contar = 0;
        int ignorouMenor = 0;
        int ignorouMaior = 0;
    
        // Soma todos, exceto uma cópia do menor e do maior
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == menor && ignorouMenor == 0) {
                ignorouMenor = 1;//serve para mesmo se os elementos forem iguais, ele retira apenas 1 
            } else if (vetor[i] == maior && ignorouMaior == 0) {
                ignorouMaior = 1;// acontece o mesmo aqui
            } else {
                soma += vetor[i];// para caso seja um elemento do centro que vai participar da soma para a média
                contar++;//contador para a divisão
            }
        }
    
        if (contar == 0) return 0; // evita divisão por zero, onde estavam ocorrendo erros 
    
        return (double) soma / contar;// Estava dando errado criar uma varíavel que guardasse a média, e encontramos esse método de return direto com uma conta
    }
    public static boolean verificaSoma(int[]vetor, double valorVerificado){
        for(int i = 0; i < vetor.length; i++){
            for(int ii = i+ 1; i < vetor.length; i++){// For dentro de for, para verificar valores diferentes,( ii = i+1, para garantir que vão ser posiçoes diferentes do vetor)
                if (vetor[i] + vetor[ii] == valorVerificado) {// caso a soma de i e ii sejam igual vai retornar o valor true
                    return true;
                }
            }   
        }
        return false;// caso não encontre o valor, ele retornará false 
    }
}