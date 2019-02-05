package by.cdp.jb27_les08;

	public class Payment {

		private String name;
		private int price;
		private PaymentDate date;

		public Payment(String name, int price, PaymentDate date) {
			this.name = name;
			this.price = price;
			this.date=date;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
		}

		public PaymentDate getDate() {
			return date;
		}
		
		public void  setDate (PaymentDate date) {
			this.date = date;
			
		}

		@Override
		public int hashCode() {
			
			final int prime = 31;
			int result = 1;
			result = prime * result + price;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			
			if (this == obj) {
				return true;
			}
			
			if (obj == null) {
				return false;
			}
			
			if (getClass() != obj.getClass()) {
				return false;
			}
			
			Payment other = (Payment) obj;
			
			/*if (price == null) {
				if (other.price!=null)
					return false;
			}
			else if {
				(!price.equals (other.price))
				return false;*/
			
			if (name == null) {
				if (other.name != null)
					return false;
			}
			else if (!name.equals(other.name))
					return false;
			return true;
			}
			

		@Override  
		public String toString() { 	 			
			
			return "Payment [name=" + name + ", price=" + price + "]"; 
	  }
	}

	

	