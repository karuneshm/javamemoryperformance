import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));
		
		//records.getCustomers().clear();
				
		for (Customer next : records.getCustomers().values())
				{
					System.out.println(next);
				}
		
//		Iterator<Customer> itr = records.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		for(Customer next :records) {
//			System.out.println(next);
//		}

	}
	
}
