package in.ashokit.binding;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {
	
	public static void main(String[] args) throws Exception {
		
		Address addr =  new Address();
		addr.setCity("Bbsr");
		addr.setState("odisha");
		addr.setCountry("India");
		
		Customer c = new Customer();
		
		c.setId(1);
		c.setName("Hitesh");
		c.setEmail("hitesh@gmail.com");
		c.setPhno(65565655);
		c.setAddr(addr);
		
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		
		System.out.println("Json Is Created");
	}
	
	
	
	

}
