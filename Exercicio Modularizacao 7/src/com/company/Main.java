package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variaveis
        Scanner entrada = new Scanner(System.in);
        int N,cont,total;
        boolean verificacao;

        //entrada total
        System.out.println("Digite o total de numeros que deseja verificar: ");
        total = entrada.nextInt();

        for (cont = 1; cont <= total; cont++) {
            //entrada
            System.out.println("Digite o Numero: ");
            N = entrada.nextInt();

            //funcao verificacao
            verificacao = Verifica(N);

            //modulo saida
            Saida(verificacao,N);
        }
    }

    public static boolean Verifica(int N){
        int numeros = 0;
         numeros = N;
        if (numeros >=0){
            return true;
        } else {
            return false;
        }
    }

    public static void Saida(boolean verificacao, int N) {
        if (verificacao){
            System.out.println("O numero: " + N + " e positivo");
        } else {
            System.out.println("O numero: " + N + " e negativo");
        }
    }


}
