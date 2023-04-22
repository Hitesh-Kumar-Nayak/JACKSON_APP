package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("Customer.json");
		
		ObjectMapper mapper = new ObjectMapper();
		Customer c = mapper.readValue(file, Customer.class);
		System.out.println(c);
	}

}
