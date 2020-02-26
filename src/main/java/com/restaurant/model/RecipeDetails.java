package com.restaurant.model;

public class RecipeDetails {

	
	private int categoryId;
	private int menuTypeId;
	private String description;
	private float price;
	private int restaurantId;
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getMenuTypeId() {
		return menuTypeId;
	}
	public void setMenuTypeId(int menuTypeId) {
		this.menuTypeId = menuTypeId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	
	
	
	
}
