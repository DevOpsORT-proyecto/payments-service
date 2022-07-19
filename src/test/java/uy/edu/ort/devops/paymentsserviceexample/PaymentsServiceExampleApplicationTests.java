package uy.edu.ort.devops.paymentsserviceexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import uy.edu.ort.devops.paymentsserviceexample.domain.PaymentStatus;
import uy.edu.ort.devops.paymentsserviceexample.logic.PaymentsLogic;

@SpringBootTest
class PaymentsServiceExampleApplicationTests {

	PaymentsLogic paymentsLogic = new PaymentsLogic();
	PaymentStatus paymentStatus = new PaymentStatus("1122",true,"Done.");

	@Test
	void paymentsLogicTest() {
		
		assertEquals("Done.", paymentsLogic.pay("11",true).getDescription() );
		assertEquals("No money.", paymentsLogic.pay("123",false).getDescription() );
	}

	@Test
	void paymentStatusTest() {
		assertEquals("Done.",paymentStatus.getDescription() );
		assertEquals("1122", paymentStatus.getOrderId() );
	}


}
