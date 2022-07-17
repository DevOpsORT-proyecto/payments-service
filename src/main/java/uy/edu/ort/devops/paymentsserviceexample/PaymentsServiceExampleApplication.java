package uy.edu.ort.devops.paymentsserviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentsServiceExampleApplication {

	public static void main(String[] args) {
		System.out.println("Payments Service Starting on Port 8080");
		System.out.println("Testing Full Automatic Deploy");
		SpringApplication.run(PaymentsServiceExampleApplication.class, args);
	}

}
