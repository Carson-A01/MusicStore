package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Album;
import main.AvailableAlbums;

public class AvailableAlbumsTest {

	@Test
	public void testSize() {
		//ARRANGE
		AvailableAlbums a = new AvailableAlbums();
		a.add("One X", "Three Days Grace", "Rock", 12.99);
		int expected = 1;
		//ACT
		int actual = a.size();
		//ASSERT
		assertEquals(expected, actual);
	}

	@Test
	public void testRemove() {
		//ARRANGE
		AvailableAlbums a = new AvailableAlbums();
		a.add("One X", "Three Days Grace", "Rock", 12.99);
		a.add("Somewhere City", "Origami Angel", "Emo", 11.99);	
		a.remove(0);
		int expected = 1;
		//ACT
		int actual = a.size();
		//ASSERT
		assertEquals(expected, actual);
	}

	@Test
	public void testAdd() {
		//ARRANGE
		AvailableAlbums a = new AvailableAlbums();
		a.add("Somewhere City", "Origami Angel", "Emo", 11.99);
		a.add("Willy and The Poor Boys", "Creedence Clearwater Revivial", "Rock", 8.99);
		int expected = 2;
		//ACT
		int actual = a.size();
		//ASSERT
		assertEquals(expected, actual);
	}

}
