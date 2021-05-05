package com.company;

import java.util.Scanner;

public class Main {
    /*A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados
    sobre o salário e número de filhos. Faça um procedimento que leia esses dados para um
    número não determinado de pessoas, calcule e exiba a média de salário da população (a
    condição de parada pode ser um flag ou a quantidade N). Faça um programa que acione o
    procedimento.
    */
    public static void main(String[] args) {
        //variaveis
        Scanner entrada = new Scanner(System.in);
        double salario = 0,total = 0,totalSalario = 0;
        int filhos = 0, cont = 0, totalFilhos = 0;
        char letra = 'S';

        while (letra == 'S' || letra == 's'){

        //entrada
        System.out.println("Digite o salario: ");
        salario = entrada.nextDouble();
        System.out.println("Digite o numero de filhos: ");
        filhos = entrada.nextInt();

        //contas
        totalFilhos += filhos;
        totalSalario += salario;
        cont++;

        //fim repeticao
        System.out.println("Deseja adicionar mais um habitante? S para Sim ou N para Nao: ");
        letra = entrada.next().charAt(0);
        }

        calculo(totalSalario, totalFilhos, cont);//procedimento
    }

    public static void calculo(double totalSalario, int totalFilhos, int cont){
        //variaveis
        double media = 0;

        //conta
        media = totalSalario / cont;

        //saida
        System.out.println("A cont: " + cont);
        System.out.println("A media salarial da populacao e: " + media);
        System.out.println("O numero de filhos e: " + totalFilhos);
    }

}
