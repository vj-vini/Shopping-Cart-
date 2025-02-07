package com.hibernate.Shopping_Cart;

import java.util.Scanner;

import com.hibernate.Shopping_Cart.repositary.ShoppingCartRepositary;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter no:");
    	switch (sc.nextInt()) {
		case 1:
			 ShoppingCartRepositary.addProduct();
			break;
		case 2:
			ShoppingCartRepositary.addUserWithCart();
			break;
		case 3:
			ShoppingCartRepositary.addProductToCart();
			break;	
			
		case 4:
			ShoppingCartRepositary.removeProductFromCart();
			break;
		case 5:
			ShoppingCartRepositary.findAllProductIncart();
			break;
		}
      
    }
}
