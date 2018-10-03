package com;

public class PhoneTester {
	public static void main(String[] args) {
		Galaxy s9 = new Galaxy ("S9", 99, "Verizon", "DINGDONGDINGDONG");
		IPhone overPriced = new IPhone ("X", 100, "AT&T", "KACHING");
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		overPriced.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());

	}
}
