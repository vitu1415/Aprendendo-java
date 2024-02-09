package aplicação;
import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qauntos numeros voce vai colocar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0; i<n ; i++){
            System.out.print("Digite o numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("\nVALOR: ");

        for(int i=0; i<n; i++){
            System.out.printf("%.1f ", vect[i]);
        }

        double soma = 0;
        for(int i=0; i<n; i++){
            soma += vect[i];
        }
        double media = soma / n;

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);
        sc.close();
    }
}
