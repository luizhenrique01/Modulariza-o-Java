package com.company;

import java.util.Scanner;

public class Main {
    /*
     Faça um procedimento que recebe a média final de um aluno, identifica e exibe o seu
    conceito, conforme a tabela abaixo. Faça um programa que leia a média de N alunos,
    acionando o procedimento para cada um deles. (N deve ser lido do teclado)
    Nota Conceito
    Até 39 F
    40 a 59 E60 a 69 D
    70 a 79 C
    80 a 89 B
    A partir de 90 A
    */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaFinal;

        System.out.println("Digite a media final do aluno");
        mediaFinal = entrada.nextDouble();

        LeituraNotas(mediaFinal);
    }

    public static void LeituraNotas(double mediaFinal){
        System.out.println(mediaFinal);

        if (mediaFinal <= 39){
            System.out.println("Conceito do aluno: F");
        }else if (mediaFinal > 40 && mediaFinal <= 59){
            System.out.println("Conceito do aluno: E");
        }else if (mediaFinal > 60 && mediaFinal <= 69){
            System.out.println("Conceito do aluno: D");
        }else if (mediaFinal > 70 && mediaFinal <= 79){
            System.out.println("Conceito do aluno: C");
        }else if (mediaFinal > 80 && mediaFinal <= 89){
            System.out.println("Conceito do aluno: C");
        }else {
            System.out.println("Conceito do aluno: A");
        }

    }

}
