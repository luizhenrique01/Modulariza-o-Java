package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variaveis
        Scanner entrada = new Scanner(System.in);
        int N,S;

        //entrada
        N = entrada.nextInt();

        //funcao
        S = Formula(N);
        ImprimeResultado(S);
    }

    private static void ImprimeResultado(int S) {
        if (S > 0) {
            System.out.println("O valor de N na funcao e: " + S);
        }else{
            System.out.println("A funcao nao aceita numeros negativos");
        }
    }

    public static int Formula(int N) {

        if (N > 0){
            return (int)((Math.pow(N,2)+1)/(N+3));
        } else{
            return -1;
        }

    }

}
