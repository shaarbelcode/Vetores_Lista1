//Exercício 1: Vendas da semana
//Leia o faturamento dos 7 dias da semana. Mostre o total, a média
//diária e o dia que mais vendeu

package org.shaarbel.segundo.bimestre;

import java.util.Scanner;

public class lista1_2bimEX1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] faturamento = new double[7];
        String[] diasSemana = new String[]{"Segunda","Terça","Quarta","Quinta","Sexta","Sábado","Domingo"};

        for (int i = 0; i < faturamento.length; i++) {
            System.out.println("Digite o  faturamento :" + diasSemana[i]);
            faturamento[i] = sc.nextDouble();
        }
        double total = 0;
        for(double tudo : faturamento){
            total += tudo;
            }
        double media = 0;
        for(double md :faturamento){
            media = total/faturamento.length;
        }
        System.out.printf("O total da semana foi de %.2f%n " , total);
        System.out.printf("A média da semana foi de %.2f%n " , media);
        }


    }
