package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Album;
import main.OnOrder;

public class OnOrderTest {

	@Test
	public void testInsert() {
		OnOrder sc = new OnOrder();
		Album a = new Album("One X", "Three Days Grace", "Rock", 12.99);
		sc.insert(a);
		int expected = 1;
		int actual = sc.size();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemove() {
		OnOrder sc = new OnOrder();
		Album a = new Album("One X", "Three Days Grace", "Rock", 12.99);
		Album a2 = new Album("Willy and The Poor Boys", "Creedence Clearwater Revivial", "Rock", 8.99);
		sc.insert(a);
		sc.insert(a2);
		sc.remove(1);
		int expected = 1;
		int actual = sc.size();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSize() {
		OnOrder sc = new OnOrder();
		Album a = new Album("One X", "Three Days Grace", "Rock", 12.99);
		Album a2 = new Album("Willy and The Poor Boys", "Creedence Clearwater Revivial", "Rock", 8.99);
		sc.insert(a);
		sc.insert(a2);
		int expected = 2;
		int actual = sc.size();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testClearCart() {
		OnOrder sc = new OnOrder();
		Album a = new Album("One X", "Three Days Grace", "Rock", 12.99);
		Album a2 = new Album("Willy and The Poor Boys", "Creedence Clearwater Revivial", "Rock", 8.99);
		sc.insert(a);
		sc.insert(a2);
		sc.clearOrders();
		int expected = 0;
		int actual = sc.size();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIsEmpty() {
		OnOrder sc = new OnOrder();
		boolean expected = true;
		boolean actual = sc.isEmpty();
		assertEquals(expected, actual);
	}
	@Test
	public void testIsEmptyFalse() {
		OnOrder sc = new OnOrder();
		Album a = new Album("One X", "Three Days Grace", "Rock", 12.99);
		Album a2 = new Album("Willy and The Poor Boys", "Creedence Clearwater Revivial", "Rock", 8.99);
		sc.insert(a);
		sc.insert(a2);
		boolean expected = false;
		boolean actual = sc.isEmpty();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCalculateTotal() {
		OnOrder sc = new OnOrder();
		Album a = new Album("One X", "Three Days Grace", "Rock", 12.99);
		Album a2 = new Album("Willy and The Poor Boys", "Creedence Clearwater Revivial", "Rock", 8.99);
		sc.insert(a);
		sc.insert(a2);
		double expected = 23.30;
		double actual = sc.calculateTotal();
		assertEquals(expected, actual, 0.01);
	}

}
