/**
 * 
 */

/**
 * @author Acer Aspire 5
 *
 */
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String OrderId;
		String Customername;
		String pickedUp;
		String Dlocation;
		String DPerson;
		double cost;
		String DType;
		double weight;
		double distance;
		double priceper1Km;
				
		System.out.println("Enter Order id : ");
		OrderId = sc.next();
		System.out.println("Enter Customer Name : ");
		Customername = sc.next();
		System.out.println("Enter Picked by : ");
		pickedUp = sc.next();
		System.out.println("Enter DeliveryLocation: ");
		Dlocation = sc.next();
		System.out.println("Enter DeliveryToPerson: ");
		DPerson = sc.next();
		System.out.println("Enter Cost: ");
		cost = sc.nextDouble();
		System.out.println("Enter DeliveryType: ");
		DType = sc.next();
		System.out.println("Enter Weight: ");
		weight = sc.nextDouble();
		System.out.println("Enter Distance: ");
		distance = sc.nextDouble();
		System.out.println("Enter Priceper1Km: ");
		priceper1Km = sc.nextDouble();
		
		Customer customer = new Customer(OrderId, Customername, pickedUp, Dlocation, DPerson, cost, DType, weight, distance, priceper1Km);
		System.out.println(customer.toString());

		
		
		if(Customer.getDeliveryType().equalsIgnoreCase("express")){
			express express = new express(customer.getWeight(),customer.getDistance(),customer.getPriceper1Km());
			System.out.println(express.calculate());
		} else if (Customer.getDeliveryType().equalsIgnoreCase("normal")){
			normal normal = new normal(customer.getWeight(),customer.getDistance(),customer.getPriceper1Km());
			System.out.println(normal.calculate());
		} else {
			System.out.println("Please input valid delivery type");
		}
		
	}

}

