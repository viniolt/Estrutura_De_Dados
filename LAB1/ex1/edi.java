import java.util.Scanner;

public class edi {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] consumos = new double[5];
        for (int i = 0; i < consumos.length; i++) {
            System.out.printf("Consumo %d:", (i+1));
            consumos[i] = scanner.nextDouble();
        }
        int qtde = 0;
        for (double consumo : consumos){
            if (consumo > 5000){
                System.out.printf("Consumo anormal: %.1f\n", consumo);
                qtde++;
            }
        }
        System.out.println("Quantidade de consumo anormal: " + qtde);
    }
}