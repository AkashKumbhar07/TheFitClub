package com.demo.TheFitClub.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class nutrition {
		
	private int nutrition_id;
	@Id
	private String nutri_name;
	private String food_group;
	private float calories;
	private float fat;
	private float protein;
	private float carbohydrates;
	private float fiber;
	public nutrition() {
		super();
	}
	public nutrition(int nutrition_id, String nutri_name, String food_group, float calories, float fat, float protein,
			float carbohydrates, float fiber) {
		super();
		this.nutrition_id = nutrition_id;
		this.nutri_name = nutri_name;
		this.food_group = food_group;
		this.calories = calories;
		this.fat = fat;
		this.protein = protein;
		this.carbohydrates = carbohydrates;
		this.fiber = fiber;
	}
	public int getNutrition_id() {
		return nutrition_id;
	}
	public void setNutrition_id(int nutrition_id) {
		this.nutrition_id = nutrition_id;
	}
	public String getNutri_name() {
		return nutri_name;
	}
	public void setNutri_name(String nutri_name) {
		this.nutri_name = nutri_name;
	}
	public String getFood_group() {
		return food_group;
	}
	public void setFood_group(String food_group) {
		this.food_group = food_group;
	}
	public float getCalories() {
		return calories;
	}
	public void setCalories(float calories) {
		this.calories = calories;
	}
	public float getFat() {
		return fat;
	}
	public void setFat(float fat) {
		this.fat = fat;
	}
	public float getProtein() {
		return protein;
	}
	public void setProtein(float protein) {
		this.protein = protein;
	}
	public float getCarbohydrates() {
		return carbohydrates;
	}
	public void setCarbohydrates(float carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	public float getFiber() {
		return fiber;
	}
	public void setFiber(float fiber) {
		this.fiber = fiber;
	}
	@Override
	public String toString() {
		return "nutrition [nutrition_id=" + nutrition_id + ", nutri_name=" + nutri_name + ", food_group=" + food_group
				+ ", calories=" + calories + ", fat=" + fat + ", protein=" + protein + ", carbohydrates="
				+ carbohydrates + ", fiber=" + fiber + "]";
	}
	
	
	
	
	
	
}
