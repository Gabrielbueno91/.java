package Atividade2Ex1;

public class Circulo {
    double raio;
    public Circulo(double raio){
        this.raio= raio;
    }
    public void calcularArea(){
        System.out.printf("A área do círculo é igual a: %.2f\n ", Math.PI * raio * raio);// Único jeito que achei de elevar era Math.pow.
    }
    public void calcularPerimetro(){
        System.out.printf("O perímetro é igual a: %.2f\n ",  2 * Math.PI * raio);
    }
    public static void main(String[] args){
        Circulo circulo = new Circulo(7.0);

        circulo.calcularArea();
        circulo.calcularPerimetro();
    }
}
