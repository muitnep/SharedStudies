/**
 * Classe que calcula a média final de uma disciplina, com base na nota das avaliações e na quantidade de faltas, e determina se o aluno foi aprovado ou não.
 *
 * @author Jessé Lopes
 */

import java.util.Scanner;

public class SistemaDoAluno {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {

            String nome;
            String curso;
            String disciplina;
            double notas;
            double somaNotas;
            double media;
            int faltas;
            int maximoFaltas;
            int aulasDisciplina;

            somaNotas = 0;
            maximoFaltas = 25;
            aulasDisciplina = 20;

            System.out.print("Digite o seu nome: ");
            nome = scanner.nextLine();

            System.out.print("\n" + "Digite o seu curso: ");
            curso = scanner.nextLine();

            System.out.print("\n" + "Digite a sua disciplina: ");
            disciplina = scanner.nextLine();

            for(int i = 1; i <= 2; i++) {
                System.out.print("\n" + "Digite a nota da avaliação " + i + ": ");
                notas = scanner.nextDouble();
                somaNotas = somaNotas + notas;
            }

            System.out.print("\n" + "Digite a quantidade de faltas: ");
            faltas = scanner.nextInt();

            media = somaNotas / 2;

            maximoFaltas = (maximoFaltas * aulasDisciplina) / 100;

            System.out.println("\n" + "O(A) aluno(a) " + nome + ", do curso de " + curso + ", possui média " + media + " e " + faltas + " faltas, na disciplina de " + disciplina + ".");

            if(media >= 6 && faltas <= maximoFaltas) {
                System.out.print("\n" + "Aluno(a) aprovado(a)!");
            } else if (media >= 6 && faltas > maximoFaltas) {
                System.out.print("\n" + "Aluno(a) reprovado(a)! Quantidade máxima de faltas excedida.");
            } else if (media < 6 && faltas <= maximoFaltas) {
                System.out.print("\n" + "Aluno(a) reprovado(a)! Média aritmética abaixo do valor mínimo para aprovação.");
            } else {
                System.out.print("\n" + "Aluno(a) reprovado(a)! Média aritmética abaixo do valor mínimo para aprovação e quantidade máxima de faltas excedida.");
            }
        }
    }
}