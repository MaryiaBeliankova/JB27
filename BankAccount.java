//Создайте класс БанковскийСчет, переопределите в нем методы equals, hashCode, toString 

//BY04 AKBB 3602 9110100040000000 - IBAN format of the account for Belarusbank
//BY - код страны по ИСО
//04- контрольный код
//АКВВ3602 - код ББ банка
//16 символов - уникальный номер счета

package by.cdp.jb27_les08;

public class BankAccount {

	public String BYcode;
	public String code;
	public String BBcode;
	public double chet;
	public String account;

	public BankAccount() {

		BYcode = "BY";
		code = "04";
		BBcode = "AKBB3602";
		chet = getBankAccountChet();

	}

	public double getBankAccountChet() {

		int step = 15; // min size of chet
		int step1 = 16; // max size of chet
		int base = 10;

		double chet1;

		double res; // res of stepen

		res = 9 * Math.pow(base, step) + (Math.pow(base, step1) - 1000);
		chet1 = Math.random();
		chet = chet1 * res;

		return chet;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		BankAccount BA = (BankAccount) obj;
		if (chet != BA.chet) {
			return false;
		}
		return true;
	}

	
	public int hashCode() {
		return (int) (chet);
	}

	
	public String toString() {
		return "Bank Account [BYcode=" + BYcode + ", code=" + code + ", Belarus Bank code=" + code + ", Chet num="
				+ chet + "+]";
	}

}
