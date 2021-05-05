package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
    /*Faça um procedimento que recebe as 3 notas de um aluno por parâmetro e uma letra. Se a
    letra for ‘A’, o procedimento calcula e escreve a média aritmética das notas do aluno, se for
    ‘P’, calcula e escreve a sua média ponderada (pesos: 5, 3 e 2). Faça um programa que leia 3
    notas de N alunos e acione o procedimento para cada aluno. (N deve ser lido do teclado)
    */
public class Main {

    //procedimento menu
    public static void calculo(int note1,int note2,int note3, char letra){
        double total;
        if (letra == 'A' || letra == 'a'){
           total = (double)(note1 + note2 + note3)/3;
           System.out.println("A media Aritimetica dos numeros e: " + total);
        } else if (letra == 'P' || letra == 'p'){
            total = (double)(((note1*5) + (note2*3) + (note3*2))/(5+2+3));
            System.out.println("A media Ponderada dos numeros e: " + total);
        } else {
            System.out.println("Error: Por favor digite uma letra valida para operacao (A- Aritimetica ou P- Ponderada)");
        }
    }

    public static void main(String[] args) {
        //variaveis
        Scanner entrada = new Scanner(System.in);
        int note1,note2,note3;
        char letra;

        //entrada
        System.out.println("Digite a nota 1: ");
        note1 = entrada.nextInt();
        System.out.println("Digite a nota 2: ");
        note2 = entrada.nextInt();
        System.out.println("Digite a nota 3: ");
        note3 = entrada.nextInt();
        System.out.println("Digite A para Media Aritimetica ou P para Media Ponderada: ");
        letra = entrada.next().charAt(0);

        //(calculo) com entrada de paramentros
        calculo(note1,note2,note3,letra); //chamada procedimento (metodo sem retorno e com parametros)

    }
}
