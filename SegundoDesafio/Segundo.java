package SegundoDesafio;

import java.util.Scanner;

public class Segundo {

	private static Scanner leitor;

	public static void main(String[] args){
		leitor = new Scanner(System.in);
		
		int n100, n50, n20, n10, n5, n2;
	    int m1, m50, m25, m10, m05, m01;
	    double n;

	    n = leitor.nextDouble();
	    int notas = (int)n;
	    int moedas = (int)((n - (double)notas) * 100);

	    if((moedas * 1000) % 10 == 9){
	        moedas++;
	    }


	    n100 = notas / 100;
	    notas = notas % 100;
	    n50 = notas / 50;
	    notas = notas % 50;
	    n20 = notas / 20;
	    notas = notas % 20;
	    n10 = notas / 10;
	    notas = notas % 10;
	    n5 = notas / 5;
	    notas = notas % 5;
	    n2 = notas / 2;
	    notas = notas % 2;

	    m1 = notas / 1;
	    notas = notas % 1;
	    m50 = moedas / 50;
	    moedas = moedas % 50;
	    m25 = moedas / 25;
	    moedas = moedas % 25;
	    m10 = moedas / 10;
	    moedas = moedas % 10;
	    m05 = moedas / 5;
	    moedas = moedas % 5;
	    m01 = moedas / 1;
	    moedas = moedas % 1;

	    System.out.printf("NOTAS:\n");

	    System.out.printf("%d nota(s) de R$ 100.00\n", n100);
	    System.out.printf("%d nota(s) de R$ 50.00\n", n50);
	    System.out.printf("%d nota(s) de R$ 20.00\n", n20);
	    System.out.printf("%d nota(s) de R$ 10.00\n", n10);
	    System.out.printf("%d nota(s) de R$ 5.00\n", n5);
	    System.out.printf("%d nota(s) de R$ 2.00\n", n2);

	    System.out.printf("MOEDAS:\n");

	    System.out.printf("%d moeda(s) de R$ 1.00\n", m1);
	    System.out.printf("%d moeda(s) de R$ 0.50\n", m50);
	    System.out.printf("%d moeda(s) de R$ 0.25\n", m25);
	    System.out.printf("%d moeda(s) de R$ 0.10\n", m10);
	    System.out.printf("%d moeda(s) de R$ 0.05\n", m05);
	    System.out.printf("%d moeda(s) de R$ 0.01\n", m01);
		
		
	}
}
