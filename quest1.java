package prova01;

import java.util.Scanner;


public class quest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAlunos = 10;
        int numNotas = 4;
        double[][] notas = new double[numAlunos][numNotas];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < numNotas; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        System.out.println("Notas coletadas:");
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            for (int j = 0; j < numNotas; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Média das notas e situação dos alunos:");
        for (int i = 0; i < numAlunos; i++) {
            double somaNotas = 0;
            for (int j = 0; j < numNotas; j++) {
                somaNotas += notas[i][j];
            }
            double media = somaNotas / numNotas;
            String situacao = (media >= 6.0) ? "Aprovado" : "Reprovado";
            System.out.println("Aluno " + (i + 1) + ": Média = " + media + ", Situação: " + situacao);
        }

        System.out.println("Média geral:");

        double somaNotas = 0;
        for (int i = 0; i < numAlunos; i++) {
            for (int j = 0; j < numNotas; j++) {
                somaNotas += notas[i][j];
            }
        }
        double mediaGeral = somaNotas / (numAlunos * numNotas);
        System.out.println("Média geral: " + mediaGeral);
        double maiorNota = notas[0][0];
        double menorNota = notas[0][0];

        for (int i = 0; i < numAlunos; i++) {
            for (int j = 0; j < numNotas; j++) {
                double notaAtual = notas[i][j];
                if (notaAtual > maiorNota) {
                    maiorNota = notaAtual;
                }
                if (notaAtual < menorNota) {
                    menorNota = notaAtual;
                }
            }
        }

        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);

    }
}









	
	


