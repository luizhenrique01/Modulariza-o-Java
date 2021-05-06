package com.company;

import java.util.Scanner;

public class Main {
    /*Escreva um procedimento que recebe 3 valores reais X, Y e Z e que verifique se esses
    valores podem ser os comprimentos dos lados de um triângulo e, neste caso, exibe qual é o
    tipo de triângulo formado. Para que X, Y e Z formem um triângulo é necessário que a
    seguinte propriedade seja satisfeita: o comprimento de cada lado de um triângulo é menor
    do que a soma do comprimento dos outros dois lados. O procedimento deve identificar o
    tipo de triângulo formado observando as seguintes definições:
    - Triângulo Equilátero: os comprimentos dos 3 lados são iguais;
    - Triângulo Isósceles: os comprimentos de pelo menos 2 lados são iguais.
    - Triângulo Escaleno: os comprimentos dos 3 lados são diferentes.
    Faça um programa que leia um número indeterminado de triângulos (valores dos 3 lados) e
    para cada triângulo, acione o procedimento.*/

    public static void main(String[] args) {
	    //variaveis
        Scanner entrada = new Scanner(System.in);
        double x = 0, y = 0, z = 0;
        char letra = 'S';

        while (letra == 'S' || letra =='s') {
            //entrada
            System.out.println("Digite o valor de X");
            x = entrada.nextDouble();
            System.out.println("Digite o valor de Y");
            y = entrada.nextDouble();
            System.out.println("Digite o valor de Z");
            z = entrada.nextDouble();


            CalculoTriangulos(x, y, z); //procedimento
            System.out.println("Deseja inserir mais um triangulo? S para Sim N para Nao");
            letra = entrada.next().charAt(0);
        }
    }

    public static void CalculoTriangulos(double x,double y,double z){
        double total, doisComprimento;
        total = x + y + z;
        doisComprimento = x + z;

        // identifica o triangulo
        IdentificadorTriangulo(x, y, z, total, doisComprimento);
    }

    public static void IdentificadorTriangulo(double x, double y, double z, double total, double doisComprimento) {
        if (x >= 0 && y >= 0 && z >= 0){
            if (total > doisComprimento){
                if (x == y && x == z){
                    System.out.println("Trinagulo Equilátero");
                } else if (x == y){
                    System.out.println("Trinagulo Isósceles");
                } else {
                    System.out.println("Trinagulo Escaleno");
                }

            } else{
                System.out.println("Error 1: Comprimento invalido");
            }

        } else {
            System.out.println("Error 2: Digite um numero valido");
        }
    }

}
