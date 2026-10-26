//Exercício 2: Estoque crítico
//Leia o estoque de 10 produtos. Mostre quantos têm menos de 5
//unidades e suas posições.

package org.shaarbel.segundo.bimestre;

import java.util.Scanner;

public class lista1_2bimEX2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]estoque = new int [10];
        String[]produto = new String[]{"Processadores","Placa de video","Gabinete","Teclado","Placa-mãe","Memoria Ram","SSD","HD","Cooler","Fonte de Alimentação"};

        for(int i= 0;i<estoque.length;i++){
            System.out.println("Digite a quantidade de "+ produto[i] +" restantes no Estoque");
                estoque[i] = sc.nextInt();
            if(estoque[i]<5){
                System.out.println("Os produtos : " + produto[i]);
                System.out.println("Estão com "+ estoque[i] + "no estoque");
            }
        }

    }
}
