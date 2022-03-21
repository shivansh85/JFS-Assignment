package com.ah.Annotations3;

import org.springframework.beans.factory.annotation.Value;

public class BMovies {
	private String name;
	private String ProductionHouse;
	private int year;
	@Override
	public String toString() {
		return "BMovies [name=" + name + ", ProductionHouse=" + ProductionHouse + ", year=" + year + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductionHouse() {
		return ProductionHouse;
	}
	@Value("xyz House")
	public void setProductionHouse(String productionHouse) {
		ProductionHouse = productionHouse;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public BMovies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BMovies(String name, String productionHouse, int year) {
		super();
		this.name = name;
		ProductionHouse = productionHouse;
		this.year = year;
	}
}