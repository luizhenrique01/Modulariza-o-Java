package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variaveis
        Scanner entrada = new Scanner(System.in);
        int notaPositiva = 0, alunosPositivos = 0, alunosNegativos = 0;
        char letra = 'S';
        double notas, media = 0;

        while (letra == 'S' || letra == 's') {

            //entrada notas
            System.out.println("Digite a nota: ");
            notas = entrada.nextInt();

            if (notas > 6){
                notaPositiva += notas;
                alunosPositivos++;
            } else {
                alunosNegativos++;
            }

            media =  Media(notaPositiva,alunosPositivos);

            System.out.println("Deseja inserir mais um aluno? S Sim N Nao: ");
            letra = entrada.next().charAt(0);
        }
        System.out.println("Numero de alunos positivos: " + alunosPositivos);
        System.out.println("Calculo da media das notas positivas: " + media);
    }

    public static double Media(int notaPositiva, int alunosPositivos){
        return (double) (notaPositiva / alunosPositivos);
    }


}

