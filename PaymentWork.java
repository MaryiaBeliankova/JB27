package by.cdp.jb27_les08;

import java.util.List;

public class PaymentWork {
	 
		public static void main(String[] args){   
			
			PaymentList myPayList = new PaymentList();     
			
			myPayList.add(new Payment("Bread", 10, new PaymentDate(1,1,2018)));   
			myPayList.add(new Payment("Milk", 15, new PaymentDate(2,2,2018)));  
			myPayList.add(new Payment("Butter", 18, new PaymentDate(3,3,2018)));     
			
			Payment findPayment = myPayList.findByContent("Milk");     
			
			if (findPayment != null){ 
				print(findPayment);  
				}  
			
			print(myPayList);   
			}  
		
		public static void print(PaymentList payList){  
			
			List <Payment> printPayments = payList.getPayment();   
			System.out.println("Payment: ");  
			
			for(int i=0; i<printPayments.size(); i++){  
				
				Payment payment = printPayments.get(i);   
				print(payment);     
				}  
			}   
		
		public static void print(Payment payment){ 
			System.out.println("Payment : " + payment.getName() + "[" + payment.getDate().getDay() + "/" + payment.getDate().getMonth() + "/" + payment.getDate().getYear() + "]."); 
			}
		}
