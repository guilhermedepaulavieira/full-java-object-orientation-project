package genericsSetMap.hashCodeEquals.application;

import genericsSetMap.hashCodeEquals.entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		Client c3 = new Client("Bob", "bob@gmail.com");
		Client c4 = new Client("Bob", "alex@gmail.com");
		Client c5 = new Client("Bob", "bob@gmail.com");
		
		String s1 = "Teste";
		String s2 = "Teste";
		String s3 = new String ("Teste");
		String s4 = new String ("Teste");
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		
		System.out.println(c1.equals(c2));
		System.out.println(c3.equals(c4));
		System.out.println(c3.equals(c5));
		
		System.out.println(c3 == c5);
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
	}
}
