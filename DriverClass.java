package DataStructure;

import java.util.Collections;

public class DriverClass 
{
	public static void main(String[] args) {
		Menu mainMenu=new Menu("Data Structure");
		
		Menu stackMenu=new Menu(2, "Stack");
		Menu listMenu=new Menu(4, "LinkedList");
		Menu arrayMenu=new Menu(1, "Array");
		Menu queueMenu=new Menu(3, "Queue");
		
		
		mainMenu.addMenuItem(arrayMenu);
		mainMenu.addMenuItem(stackMenu);
		mainMenu.addMenuItem(queueMenu);
		mainMenu.addMenuItem(listMenu);
		
		
		arrayMenu.addMenuItem(new MenuItem(1, "Insert"));
		arrayMenu.addMenuItem(new MenuItem(3, "Delete"));
		arrayMenu.addMenuItem(new MenuItem(4, "Update"));
		arrayMenu.addMenuItem(new MenuItem(5, "Search"));
		arrayMenu.addMenuItem(new MenuItem(0, "Back"));
		arrayMenu.addMenuItem(new MenuItem(2, "Display"));
		
		
		
		
		stackMenu.addMenuItem(new MenuItem(0, "Back"));
		stackMenu.addMenuItem(new MenuItem(1, "Push"));
		stackMenu.addMenuItem(new MenuItem(2, "Pop"));
		stackMenu.addMenuItem(new MenuItem(3, "Peek"));
		stackMenu.addMenuItem(new MenuItem(4, "Update"));
		stackMenu.addMenuItem(new MenuItem(5, "Search"));
		
		
		queueMenu.addMenuItem(new MenuItem(0, "Back"));
		queueMenu.addMenuItem(new MenuItem(1, "Enqueue"));
		queueMenu.addMenuItem(new MenuItem(2, "Dequeue"));
		queueMenu.addMenuItem(new MenuItem(3, "Peek"));
		queueMenu.addMenuItem(new MenuItem(4, "Update"));
		queueMenu.addMenuItem(new MenuItem(5, "Search"));
		
		listMenu.addMenuItem(new MenuItem(0, "Back"));
		listMenu.addMenuItem(new MenuItem(1, "Insert"));
		listMenu.addMenuItem(new MenuItem(2, "Delete"));
		listMenu.addMenuItem(new MenuItem(3, "Update"));
		listMenu.addMenuItem(new MenuItem(4, "Search"));
		
	
		mainMenu.displayMi();
		//Collections.sort(listMenu);
		//listMenu.displayMi();
	}

}
