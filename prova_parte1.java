import java.util.Scanner;

public class SistemaEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor para armazenar as 8 notas
        double[] notas = new double[8];

        // Recebendo as 8 notas do aluno
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais
        double bimestre1 = (notas[0] + notas[1]) / 2;
        double bimestre2 = (notas[2] + notas[3]) / 2;
        double semestre1 = (bimestre1 + bimestre2) / 2;

        double bimestre3 = (notas[4] + notas[5]) / 2;
        double bimestre4 = (notas[6] + notas[7]) / 2;
        double semestre2 = (bimestre3 + bimestre4) / 2;

        // Cálculo da média final
        double mediaFinal = (semestre1 + semestre2) / 2;

        // Exibindo os resultados
        System.out.println();
        System.out.println("1º Bimestre: " + bimestre1);
        System.out.println("2º Bimestre: " + bimestre2);
        System.out.println("1º Semestre: " + semestre1);
        System.out.println("----------------------");
        System.out.println("3º Bimestre: " + bimestre3);
        System.out.println("4º Bimestre: " + bimestre4);
        System.out.println("2º Semestre: " + semestre2);
        System.out.println("----------------------");
        System.out.println("Média Final: " + mediaFinal);

        scanner.close();
    }
}
