package by.cdp.jb27_les08;

import java.util.ArrayList;
import java.util.List;

	
public class PaymentList {

	private List<Payment> payments = new ArrayList<Payment>();

	public PaymentList() {

	}

	public List<Payment> getPayment() {
		return payments;
	}

	public void add(Payment payment) {
		payments.add(payment);
	}

	public boolean delete(Payment payment) {
		return payments.remove(payment);
	}

	public Payment findByContent(String content) {

		for (Payment payment : payments) {

			if (payment.getName().equals(content)) {

				return payment;
			}
		}
		return null;
	}
}


