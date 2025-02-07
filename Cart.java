package com.hibernate.Shopping_Cart.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cart {
	@Id
	private int cartId;
	
	@ManyToMany
	private List<Product> products;

	/**
	 * @return the cartId
	 */
	public int getCartId() {
		return cartId;
	}

	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

//	@Override
//	public String toString() {
//		return "Cart [cartId=" + cartId + ", products=" + products + ", getCartId()=" + getCartId() + ", getProducts()="
//				+ getProducts() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//				+ super.toString() + "]";
//	}
//
	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", products=" + products + "]";
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
