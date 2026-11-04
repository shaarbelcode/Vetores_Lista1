//10 clientes deram nota de 0 a 10. Mostre quantas vezes cada nota
//apareceu e a mais votada
//(Professor, essa daqui eu coloquei sua resolução , encuquei demais e nao fiz porém entendi a logica da sua estrutura)
package org.shaarbel.segundo.bimestre;
import java.util.Scanner;

public class lista1_2bimEX5 {
        public static void main() {

            int[] notas = new int[]{1, 1, 1, 2, 3, 3, 3, 3, 4, 9};
            int[] apareceu = new int[11];

            for (int i = 0; i < notas.length; i++) {
                apareceu[notas[i]]++;
            }
            int maior = 0;
            int notaMaisVotada = 0;
            for (int i = 0; i < apareceu.length; i++) {
                if (apareceu[i] > maior) {
                    maior = apareceu[i];
                    notaMaisVotada = i;
                }
                IO.println("O valor " + i + " apareceu " + apareceu[i] + " vezes");
            }
            IO.println("A nota mais votada foi " + notaMaisVotada + ", aparecendo " + apareceu[notaMaisVotada] + " vezes");
        }

    }