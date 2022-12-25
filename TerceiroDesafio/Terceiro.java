package TerceiroDesafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Terceiro {
	
		private static Scanner ler;

		public static void main(String[] args) throws Exception {
        

			  int n;
			  int K;
			  int[] a = new int[1];
			  System.out.printf("Informe o tamanho da lista e o K:");
			  
			  for(int y = 0; y <= 1;y++) {
				  ler = new Scanner(System.in);
				  a[y] = ler.nextInt(); 
			  }
			  
			  n = a[0];
			  K = a[1];
			             
			  ArrayList<Integer> entrada = new ArrayList<Integer>();
			  int Contador = 0;
			  
			  System.out.println("Informe os numeros da lista:");
			  for (int i = 0; i < n; i++) {
			      ler = new Scanner(System.in);
			      entrada.add(ler.nextInt());   
			  }
			  
			  
			  
			  for(int j=0;j < entrada.size();j++) {
				  int num = j + 1;
				  if((entrada.get(num) - entrada.get(j)) == K) {
					  Contador++;
				  }
			  }
			  
			  System.out.println(Contador);
			  
			  
			  
			
			}
	}


