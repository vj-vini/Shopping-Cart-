package com.hibernate.Shopping_Cart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	private int userId;
	private String userName;
	private String userEmail;
	private long userMobile;
	
	@OneToOne
	private Cart cart;

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the userMobile
	 */
	public long getUserMobile() {
		return userMobile;
	}

	/**
	 * @param userMobile the userMobile to set
	 */
	public void setUserMobile(long userMobile) {
		this.userMobile = userMobile;
	}

	/**
	 * @return the cart
	 */
	public Cart getCart() {
		return cart;
	}

//	@Override
//	public String toString() {
//		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userMobile="
//				+ userMobile + ", cart=" + cart + "]";
//	}
	

	/**
	 * @param cart the cart to set
	 */
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userMobile="
				+ userMobile + ", cart=" + cart + "]";
	}
}
