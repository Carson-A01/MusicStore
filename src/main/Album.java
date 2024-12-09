package main;

public class Album implements Comparable<Album>{
	//attributes
	private String aName;
	private String bName;
	private String genre;
	private double price;
	//constructor
	public Album(String aName, String bName, String genre, double price) {
		this.aName = aName;
		this.bName = bName;
		this.genre = genre;
		this.price = price;
	}
	//Getters
	public String getAName() {
		return aName;
	}
	public String getBName() {
		return bName;
	}
	public String getGenre() {
		return genre;
	}
	public double getPrice() {
		return price;
	}
	//toString
	public String toString() {
		return "[Band: " + bName + ", Album: " + aName + ", Genre: " + genre + ", Price: " + price + "]";
	}
	//Compares prices and sorts each album alphabetically by genre
	public int compareTo(Album a) {
		return this.getGenre().compareTo(a.getGenre());
	}
}
