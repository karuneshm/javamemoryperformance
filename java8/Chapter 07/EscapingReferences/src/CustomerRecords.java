import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}
		
//	public Map<String, Customer> getCustomers() {
//		return this.records;
//	}
	
//	//Stratergy - 2
//	public Map<String, Customer> getCustomers() {
//		return new HashMap<>(this.records);
//	}

	
	//Stratergy - 1
	@Override
	public Iterator<Customer> iterator() {
		return records.values().iterator();
	}
	
	//Stratergy - 3
		public Map<String, Customer> getCustomers() {
			return Collections.unmodifiableMap(records);
		}
}
