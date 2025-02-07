package com.hibernate.Shopping_Cart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int productId;
	private String productName;
	private String productBrand;
	private int productprice;
//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", productName=" + productName + ", productBrand=" + productBrand
//				+ ", productprice=" + productprice + ", getProductId()=" + getProductId() + ", getProductName()="
//				+ getProductName() + ", getProductBrand()=" + getProductBrand() + ", getProductprice()="
//				+ getProductprice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//				+ super.toString() + "]";
//	}
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productBrand=" + productBrand
				+ ", productprice=" + productprice + "]";
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productBrand
	 */
	public String getProductBrand() {
		return productBrand;
	}
	/**
	 * @param productBrand the productBrand to set
	 */
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	/**
	 * @return the productprice
	 */
	public int getProductprice() {
		return productprice;
	}
	/**
	 * @param productprice the productprice to set
	 */
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	
	
	
}
