package main;

/** This program is my final for Data Structures, it has guis that display things like inventory for a music store
 * @author Carson Allbee
 * @version 1.0
 * @since 1.0
*/
/*  
* OS: [Windows]
* IDE: [eclipse]
* Copyright : This is my own original work 
* based on specifications issued by our instructor
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or
* unmodified, nor used generative AI as a final draft. 
* I have not given other fellow student(s) access to my program.
*/

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Driver {
	
	public static void main(String[] args) {
		AvailableAlbums aa = new AvailableAlbums();
		OnOrder sc = new OnOrder();
		//building AvailableAlbums
		aa.add("Willy And The Poor Boys", "Creedence Clearwater Revival", "Rock", 8.99);
		aa.add("In Keeping Secrets of Silent Earth 3", "Coheed and Cambria", "Alt-Metal", 10.99);
		aa.add("Somewhere City", "Origami Angel", "Math Rock", 12.99);
		aa.add("Second Stage Turbine Blade", "Coheed and Cambria", "Alt-Metal", 9.99);
		aa.add("Kind Of Blue", "Miles Davis", "Jazz", 6.99);
		aa.add("Theory Of Mind", "Kublai-Khan TX", "Hardcore", 15.99);
		aa.add("Epiphany", "T-Pain", "Hip-Hop", 7.95);
		aa.add("Rappa Ternt Sanga", "T-Pain", "Hip-Hop", 5.99);
		
		//building OnOrder
		Album toCopy = aa.retrieveAlbum(2);
		Album toCopy1 = aa.retrieveAlbum(3);
		Album toCopy2 = aa.retrieveAlbum(0);
		Album toCopy3 = aa.retrieveAlbum(4);
		Album toCopy4 = aa.retrieveAlbum(5);
		Album sm = new Album("Selfish Machines", "Pierce The Veil", "Emo", 13.00);
		sc.insert(toCopy);
		sc.insert(toCopy1);
		sc.insert(toCopy2);
		sc.insert(toCopy3);
		sc.insert(toCopy4);
		sc.insert(sm);
		//GUI declarations
		JFrame frame = new JFrame();
		JFrame order = new JFrame();
		RatingFrame rate = new RatingFrame();
		JTextArea onOrder = new JTextArea();
		JPanel onOrderPanel = new JPanel();
		JLabel orderTotal = new JLabel();
		JTextArea inventory = new JTextArea();
		//setup for frame JFrame
		inventory.setEditable(false);
		inventory.setText(aa.displayAlbums());
		frame.add(inventory);
		frame.setTitle("Inventory");
		frame.setSize(1000, 500);
		frame.setVisible(true);
		//setup for order JFrame
		onOrder.setText(sc.printList());
		onOrder.setEditable(false);
		orderTotal.setText("The total price of product on order is: " + sc.calculateTotal());
		onOrderPanel.add(onOrder);
		onOrderPanel.add(orderTotal);
		onOrderPanel.setLayout(new FlowLayout());
		order.add(onOrderPanel);
		order.setSize(1000, 200);
		order.setVisible(true);
		order.setTitle("On Order");
		
		//Console prints to help with removal method visualization
		System.out.println("Available Albums: ");
		System.out.println(aa.displayAlbums());
		System.out.println("");
		System.out.println("Albums on order: ");
		System.out.println(sc.printList());
		System.out.println("");
		System.out.println("Available Albums after 2nd album removal");
		aa.remove(1);
		System.out.println(aa.displayAlbums());
		System.out.println("");
		System.out.println("On Order after 2nd album removal");
		sc.remove(1);
		System.out.println(sc.printList());
		System.out.println("On Order after clear:");
		sc.clearOrders();
		System.out.println(sc.printList());
	};	
}
