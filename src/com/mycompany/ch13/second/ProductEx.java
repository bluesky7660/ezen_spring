package com.mycompany.ch13.second;

public class ProductEx {

	public static void main(String[] args) {
		product<String, Integer> product = new product<>();
		
		product.setKind("Tony");
		product.setModel(100);
		
		product<Tv, String> product2 = new product<>();
		System.out.println(product.getKind()+" : "+ product.getModel());
	}

}
