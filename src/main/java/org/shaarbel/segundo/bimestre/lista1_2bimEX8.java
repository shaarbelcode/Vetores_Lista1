//Exercício 8: Juntando relatórios
//Duas filiais enviam suas vendas já ordenadas. Gere um único vetor
//ordenado percorrendo os dois ao mesmo tempo, sem juntar e
//ordenar depois

package org.shaarbel.segundo.bimestre;

public class lista1_2bimEX8 {
    public static void main(String[] args) {
        int[]filial1 = new int[]{10,30,50,70};
        int[]filial2 = new int[]{20,40,60,80};
        int[]ordenado = new int[8];

        int i=0,j=0,k=0;
        while(i<filial1.length&&j<filial2.length){
            k++;
            System.out.println(k);
            break;
        }
    }
}
