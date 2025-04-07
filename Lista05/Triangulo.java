package Lista05;

public class Triangulo {
    double base;
    double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea(){
        return (base * altura) / 2; 
    }

    public static void main(String[]args){
        Triangulo t1 = new Triangulo(20, 69);
        Triangulo t2 = new Triangulo(9, 7);
        Triangulo t3 = new Triangulo(30, 54);
        System.out.println("A área de T1 "+t1.base+ " * " + t1.altura + " = " + t1.calculaArea());
        System.out.println("A área de T2 "+t2.base+ " * " + t2.altura + " = " + t2.calculaArea());
        System.out.println("A área de T3 "+t3.base+ " * " + t3.altura + " = " + t3.calculaArea());
    }
}
