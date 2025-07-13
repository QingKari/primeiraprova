import java.util.Scanner;

public class ConversaoTemperaturaCompleta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversão para Fahrenheit e Kelvin
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Exibição dos resultados
        System.out.println();
        System.out.println("Temperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        scanner.close();
    }
}
