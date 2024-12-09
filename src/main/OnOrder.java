package main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;

//PriorityQueue using LinkedList
public class OnOrder {
	//Attributes
	LinkedList<Album> albums;
	//Constructors
	public OnOrder() {
		albums = new LinkedList<Album>();
	}
	public OnOrder(String aName, String bName, String genre, double price) {
		albums = new LinkedList<Album>();
	}
	//Methods
	//returns the size of the linkedlist
	public int size() { return albums.size(); }
	//returns true if size is 0
	public boolean isEmpty() { return size() == 0; }
	//inserts a new album into the linkedlist
	public void insert(Album a) {
		albums.add(a);
	}
	//removes specific album if linkedlist isn't empty
	public void remove(int removedAlbum) {
		try {
			albums.remove(removedAlbum);
		} catch (NoSuchElementException e) {
			System.out.println("Cart is empty, cannot remove.");
		}
	}
	//clears shopping cart of all albums
	public void clearOrders() {
		albums.clear();
	}
	//calculates the total of all the albums on order
	public double calculateTotal() {
		double tax = 0.06;
		double salesTax;
		double sum = 0;
		double total = 0;
		for(int i = 0; i < albums.size(); i++) {
			sum += albums.get(i).getPrice();
		}
		salesTax = sum * tax;
		total = sum + salesTax;
		double formattedTotal = Math.round(total * 100.0) / 100.0;
		return formattedTotal;
	}
	//prints all albums in linkedlist, sorted by genre
	public String printList() {
		Collections.sort(albums);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < albums.size(); i++) {
			sb.append(albums.get(i));
			if(i < albums.size() - 1) {
				sb.append("\n");
			}
		}
		return sb.toString();
	}
}
