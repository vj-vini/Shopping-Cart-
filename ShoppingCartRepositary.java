package com.hibernate.Shopping_Cart.repositary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Shopping_Cart.entity.Cart;
import com.hibernate.Shopping_Cart.entity.Product;
import com.hibernate.Shopping_Cart.entity.User;



public class ShoppingCartRepositary {
	static Configuration cfg = new Configuration().configure().addAnnotatedClass(User.class)
			.addAnnotatedClass(Cart.class).addAnnotatedClass(Product.class);
	static SessionFactory sf=cfg.buildSessionFactory();
	static Scanner sc=new Scanner(System.in);
	public static void addProduct() {
		Session session=sf.openSession();
		Transaction tran=session.beginTransaction(); 
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter brand");
		String brand=sc.next();
		System.out.println("enter price");
		int price=sc.nextInt();
		Product p1=new Product();
		p1.setProductId(id);
		p1.setProductName(name);
		p1.setProductBrand(brand);
		p1.setProductprice(price);
		session.save(p1);
		tran.commit();
		session.close();
	    sf.close();
	}
	public static  void addUserWithCart() {
		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		System.out.println("Enter userId:");
		int userid=sc.nextInt();
		System.out.println("Enter userName:");
		String name=sc.next();
		System.out.println("Enter userEmail:");
		String Email=sc.next();
		System.out.println("Enter userNum:");
		long num=sc.nextLong();
		System.out.println("Enter cartId:");
		int cartId=sc.nextInt();
		User u1=new User();
		u1.setUserId(userid);
		u1.setUserName(name);
		u1.setUserEmail(Email);
		u1.setUserMobile(num);
		
		Cart c1=new Cart();
		c1.setCartId(cartId);
		
		u1.setCart(c1);
		session.save(u1);
		session.save(c1);
		tran.commit();
		session.close();
	    sf.close();
		
	}
	public static void addProductToCart() {
		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		System.out.println("enter productId");
		Product product=session.get(Product.class, sc.nextInt());
		if(product!=null) {
			System.out.println("enter user Id");
			User user=session.get(User.class, sc.nextInt());
		if(user!=null) {
			Cart cart=user.getCart();
			cart.getProducts().add(product);
			session.update(cart);
		}
		else {
			System.err.println("User Not Found!!");
		}
	}else {
		System.err.println("Product Not Found!!");
	}
		tran.commit();
		session.close();
	}
	public static void removeProductFromCart() {
		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		System.out.println("enter productId");
		Product product=session.get(Product.class, sc.nextInt());
		if(product!=null) {
			System.out.println("enter user Id");
			User user=session.get(User.class, sc.nextInt());
		if(user!=null) {
			Cart cart=user.getCart();
			cart.getProducts().remove(product);
			session.delete(product);
		}
		else {
			System.err.println("User Not Found!!");
		}
	}else {
		System.err.println("Product Not Found!!");
	}
		tran.commit();
		session.close();
	}
	public static void findAllProductIncart() {
		Session session=sf.openSession();
		Transaction tran=session.getTransaction();
		tran.begin();
		System.out.println("enter ProductId:");
		Product product=session.get(Product.class, sc.nextInt());
		if(product!=null) {
			System.out.println("enter userId:");
			User user=session.get(User.class, sc.nextInt());
		if(user!=null) {
			Cart cart=user.getCart();
			session.get(Product.class, sc.nextInt());
			System.out.println(product);
		}
		else {
			System.err.println("User Not Found!!");
		}
	}else {
		System.err.println("Product Not Found!!");
	}

			tran.commit();
			session.close();
			sf.close();
	}

		
	}

