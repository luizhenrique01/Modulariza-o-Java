package com.company;

import java.util.Scanner;

public class Main {
    /*
    Faça um procedimento que recebe 3 valores inteiros por parâmetro e os exiba em ordem
    crescente. Faça um programa que leia N conjuntos de 3 valores e acione o procedimento
    para cada conjunto. (N deve ser lido do teclado)
    */
    public static void main(String[] args) {
        //variaveis
        Scanner entrada = new Scanner(System.in);
        int valor1=0,valor2=0,valor3=0,cont,N;

        //entrada numero de conjuntos
        System.out.println("Digite a quantidade de conjuntos de 3 desejada: ");
        N = entrada.nextInt();

        for (cont = 0; cont < N; cont++) {
            //entrada
            System.out.println("Digite o 1 valor");
            valor1 = entrada.nextInt();
            System.out.println("Digite o 2 valor");
            valor2 = entrada.nextInt();
            System.out.println("Digite o 3 valor");
            valor3 = entrada.nextInt();

            crescente(valor1, valor2, valor3); //modularizacao ordem crescente
        }
    }

    public static void crescente(int valor1, int valor2, int valor3){
        int primeiro,segundo,terceiro;

        //conta valor crescente
        ContaCrescente(valor1, valor2, valor3);
    }

    public static void ContaCrescente(int valor1, int valor2, int valor3) {
        int segundo;
        int primeiro;
        int terceiro;
        if (valor1 > valor2 && valor1 > valor3){
            primeiro = valor1;
            System.out.println(primeiro);
            if (valor2 > valor3){
            segundo = valor2;
            System.out.println(segundo);
            terceiro = valor3;
                System.out.println(terceiro);
            }else{
                segundo = valor3;
                System.out.println(segundo);
                terceiro = valor2;
                System.out.println(terceiro);
            }
        } else if (valor2 > valor1 && valor2 > valor3){
            primeiro = valor2;
            System.out.println(primeiro);
            if (valor1 > valor3){
                segundo = valor1;
                System.out.println(segundo);
                terceiro = valor3;
                System.out.println(terceiro);
            } else {
                segundo = valor3;
                System.out.println(segundo);
                terceiro = valor1;
                System.out.println(terceiro);
            }

        } else {
            primeiro = valor3;
            System.out.println(primeiro);
            if (valor1 > valor2){
                segundo = valor1;
                System.out.println(segundo);
                terceiro = valor2;
                System.out.println(terceiro);
            } else{
                segundo = valor2;
                System.out.println(segundo);
                terceiro = valor1;
                System.out.println(terceiro);
            }
        }
    }

}
