package TesteDIO5;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor:");
        double valor = scanner.nextDouble();

        double valorFinal = valor + COFINS.calcularImposto(valor) + ICMS.calcularImposto(valor) + IPI.calcularImposto(valor);

        System.out.printf("ICMS: %.2f\n",ICMS.calcularImposto(valor));
        System.out.printf("IPI: %.2f\n",IPI.calcularImposto(valor));
        System.out.printf("COFINS: %.2f\n",COFINS.calcularImposto(valor));
        System.out.printf("Valor final: %.2f\n",valorFinal);

        scanner.close();
    }
}
