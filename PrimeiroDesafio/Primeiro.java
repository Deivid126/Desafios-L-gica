package PrimeiroDesafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Primeiro {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer newN = new StringTokenizer(br.readLine());
        int linhas = Integer.parseInt(newN.nextToken());
        
        List<Integer> listadeNumeros = new ArrayList<>();
        
        for(int i = 0; i < linhas; i++) {
        	newN = new StringTokenizer(br.readLine());
        	listadeNumeros.add(Integer.parseInt(newN.nextToken()));
        }
        
        var numpares = listadeNumeros.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
		var numimpares = listadeNumeros.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		
		List<Integer> total = new ArrayList<>();
		total.addAll(numpares);
		total.addAll(numimpares);
		total.forEach(System.out::println);
	}
}
