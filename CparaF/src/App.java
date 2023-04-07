import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        double Fahrenheit;
        double Celsius;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a temperatura em Celsius?");
        Celsius = teclado.nextDouble();
        teclado.close();
        Fahrenheit = (Celsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit);

    }
}