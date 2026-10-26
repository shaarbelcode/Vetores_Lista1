//Aplique 10% de reajuste aos salários de 8 funcionários, com limite
//de R$ 5.000,00. Mostre os salários antes e depois e o aumento
//total da folha.

package org.shaarbel.segundo.bimestre;

import java.util.Scanner;

public class lista1_2bimEX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salario = new double[]{1914.56, 2554.50, 3000.00, 2519.60, 1614.50, 4950.50, 2000.00, 3102.02};
        String[] funcionarios = new String[]{"João", "Shaarbel", "Maria", "Alice", "Pedro", "Carlos", "Natalia", "Nicole"};
        double aumentoTotal = 0;

        for (int i = 0; i < funcionarios.length; i++) {
            double calculo = salario[i] * 0.10;
            double novoSalario = salario[i] + calculo;
            if (novoSalario > 5000.00) {
                novoSalario = 5000.00;
            }
                aumentoTotal +=(novoSalario-salario[i]);
                System.out.println(funcionarios[i] + " Salarío antigo : " + salario[i] + " -----> " + " Novo Salário " + novoSalario);
            }
                System.out.println("O aumento total da folha de funcionarios foi de : " + aumentoTotal);
        }
    }

