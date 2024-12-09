package main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class AvailableAlbums {
	//attributes
	private LinkedList<Album> albums;
	//constructor
	public AvailableAlbums() {
		albums = new LinkedList<Album>();
	}
	public AvailableAlbums(String aName, String bName, String genre, double price) {
		albums = new LinkedList<Album>();
	}
	//returns size of linkedlist
	public int size() {
		return albums.size();
	}
	//removes item from linkedlist if it isn't empty
	public void remove(int item) {
		try {
			albums.remove(item);
		} catch (NoSuchElementException e) {
			System.out.println("This album doesn't exist");
		}
	}
	//adds an album to linkedlist
	public boolean add(String aName, String bName, String genre, double price) {
		Album a = new Album(aName, bName, genre, price);
		return albums.add(a);
	}
	//method for copying an album
	public Album retrieveAlbum(int e) {
		if(e <= albums.size() && e >= 0) {
			return albums.get(e);
		}
		else {
			return null;
		}
	}
	//displays all albums in linkedlist
	public String displayAlbums() {
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
