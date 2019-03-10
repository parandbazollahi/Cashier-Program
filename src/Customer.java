/**
 * this class return total cash, add item to customer, give order which use a Command pattern 
 * @author Parand.bazollahi
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Customer {
	ArrayList<StoreItem> itemList;
	double balance;
	double totalCash;

	public Customer() {
		itemList = new ArrayList<StoreItem>();
	}
	
	public  void addItem(StoreItem  item) {
		itemList.add(item);
	}
	
	List<Command> commandList = new ArrayList<Command>();

	public void Order(Command order) {
		commandList.add(order);
	}

	public void GiveOrder() {

		for (Command order : commandList) {
			order.execute();
		}
		commandList.clear();
	}
	
	public double GiveMoney(double balance) {
		if (balance < totalCash)
		{
			
			totalCash = totalCash - balance;
		}
		int rounded = (int) (((balance + 5)/100) * 100);
		return rounded ;
	}

	public void SetMoney(double money) {
		totalCash = money;
	}
	
	public double TotalCash() {
		return totalCash;
	}
}
