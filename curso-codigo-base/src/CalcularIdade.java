import java.util.Scanner;

public class CalcularIdade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, dias, horas, minutos, segundos;

        System.out.println("Insira a sua idade: ");
        idade = input.nextInt();

        dias = idade * 365;
        horas = dias * 24;
        minutos = horas * 60;
        segundos = minutos *60;

        System.out.println("Você tem: " + idade + " anos de idade, " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");

    }
}
