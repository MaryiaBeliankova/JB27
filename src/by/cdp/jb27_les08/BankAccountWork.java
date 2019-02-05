package by.cdp.jb27_les08;

public class BankAccountWork {

	public static void main(String[] args) {

		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();

		ba1.getBankAccountChet();
		ba2.getBankAccountChet();

		System.out.println(
				"IBAN: " + ba1.BYcode + " " + ba1.code + " " + ba1.BBcode + " " + String.format("%.0f", ba1.chet));
		System.out.println(
				"IBAN: " + ba2.BYcode + " " + ba2.code + " " + ba2.BBcode + " " + String.format("%.0f", ba2.chet));

		
		if (ba1.equals(ba2)) {

			System.out.println("Chets numbers for accounts are true");
		} else {

			System.out.println("Chets numbers for accounts are false");
		}

		System.out.println(ba1.hashCode());
		System.out.println(ba2.hashCode());

	}
}
