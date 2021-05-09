package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variavel
        Scanner entrada = new Scanner(System.in);
        int idade;
        char categoria;

        //entrada
        idade = entrada.nextInt();

        //funcao
        categoria = Categoria(idade);

        //saida
        System.out.println("Categoria do nadador: " + categoria);
    }

    public static char Categoria(int idade){
        if (idade >= 5 && idade <= 7){
            return 'F';
        }else if (idade >= 8 && idade <= 10){
            return 'E';
        }else if (idade >= 11 && idade <= 13){
            return 'D';
        }else if (idade >= 14 && idade <= 15){
            return 'C';
        }else if (idade >= 16 && idade <= 17){
            return 'B';
        } else if (idade > 18){
            return 'A';
        } else {
            return '.';
        }

    }


}
