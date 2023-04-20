package application;

import entities.Client;

public class Program00 {

	public static void main(String[] args) {
		
		Client c1 = new  Client("Maria", "maria@maria.com");
		Client c2 = new  Client("Maria", "maria@maria.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // compara a referencia de memoria do objeto
		System.out.println(s1 == s2); 
	}

}
