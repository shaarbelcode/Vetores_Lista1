//Dois vetores guardam o nome e o total vendido de 6 vendedores.
//Mostre o ranking do maior para o menor, sem métodos prontos de
//ordenação.

package org.shaarbel.segundo.bimestre;

public class lista1_2bimEX7 {
        public static void main(String[] args) {
            String[] nomes = new String[]{"José", "Rafaela", "Lucas", "Paulo", "Paula", "Bruna"};
            int[] totalVendas = new int[]{6, 7, 5, 2, 3, 9};

            System.out.println("-----RANKING VENDAS-----");

            for (int i = 0; i < totalVendas.length; i++) {
                for (int j = 0; j < totalVendas.length - 1; j++) {
                    if (totalVendas[j] < totalVendas[j + 1]) {

                        int valorVenda = totalVendas[j];
                        totalVendas[j] = totalVendas[j + 1];
                        totalVendas[j + 1] = valorVenda;

                        String nomeVenda = nomes[j];
                        nomes[j] = nomes[j + 1];
                        nomes[j + 1] = nomeVenda;
                    }
                }
            }
            for (int i = 0; i < totalVendas.length; i++) {
                System.out.println(nomes[i] + ": " + totalVendas[i]);
            }
        }
    }
