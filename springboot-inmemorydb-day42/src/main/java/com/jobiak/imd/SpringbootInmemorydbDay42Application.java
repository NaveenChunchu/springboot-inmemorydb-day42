package com.jobiak.imd;

//import java.util.List;
//import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.jobiak.imd.model.Customer;
//import com.jobiak.imd.repository.CustomerRepo;

@SpringBootApplication
public class SpringbootInmemorydbDay42Application {

//	@Autowired
	// CustomerRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootInmemorydbDay42Application.class, args);

	}

	/*
	 * @Override public void run(String... args) throws Exception { Customer c1=new
	 * Customer(); c1.setAcctno(101); c1.setName("Xiang"); c1.setBalance(4000);
	 * repo.save(c1);
	 * 
	 * Customer c2=new Customer(); c2.setAcctno(102); c2.setName("Nobitha");
	 * c2.setBalance(4100); repo.save(c2);
	 * 
	 * Customer c3=new Customer(); c3.setAcctno(103); c3.setName("Deki-Suki");
	 * c3.setBalance(3400); repo.save(c3);
	 * 
	 * Customer c4=new Customer(); c4.setAcctno(104); c4.setName("Sujuka");
	 * c4.setBalance(6500); repo.save(c4);
	 * 
	 * 
	 * 
	 * Optional<Customer> cust= repo.findById(102L);
	 * 
	 * if(cust.isPresent()) { System.out.println(cust.get()); }
	 * 
	 * List<Customer>list =repo.findAll(); for(Customer c:list) {
	 * System.out.println(c); }
	 * 
	 * }
	 */

}
