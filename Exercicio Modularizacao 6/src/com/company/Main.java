package com.company;

import java.util.Scanner;

public class Main {
    /*
    Escreva uma função que recebe por parâmetro um valor inteiro e positivo N e retorna o
    valor de S, calculado segundo a fórmula abaixo.
    S = 1 + 1/1! + ½! + 1/3! + 1 /N!
    Faça um programa que leia N e imprima o valor retornado pela função.
    */
    public static void main(String[] args) {
        //variaveis
        Scanner entrada = new Scanner(System.in);
        int  N,S;

        //entrada
        System.out.println("Digite o N da formula");
        N = entrada.nextInt();

        S  = Fatorial(N);
        System.out.println(S);

    }

    public static int Fatorial(int N) {

        int num, valor;
        double S, fat;
        if (N > 0) {
            S = 1;
            for (num = 1; num <= N; num++) {
                fat = 1;
                for (valor = num; valor > 1; valor--) {
                    fat = fat * valor;
                }
                S = S + 1 / fat;
            }

            return (int) S;

        } else {
            return 0;
        }

    }



}
