package by.cdp.jb27_les08;

public class PaymentDate {
	
		private int day;
		private int month;
		private int year;

		public PaymentDate (int day, int month, int year) {
			this.day = day;
			this.month = month;
			this.year = year;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + day;
			result = prime * result + month;
			result = prime * result + year;
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
			PaymentDate other = (PaymentDate) obj;
			if (day != other.day) {
				return false;
			}
			if (month != other.month) {
				return false;
			}
			if (year != other.year) {
				return false;
			}
			return true;
		}

		@Override  public String toString() { 
	 
	  return "Data [day=" + day + ", month=" + month + ", year=" + year + "]";  }
	}

