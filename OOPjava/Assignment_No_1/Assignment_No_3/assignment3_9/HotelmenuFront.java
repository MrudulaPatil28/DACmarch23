package oopj.assignment3_9;

public class HotelmenuFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char choice;
		HotelmenuBack.shouMenu();
		while ((choice = HotelmenuBack.choice()) != 'N') {
			HotelmenuBack.choice();
		}
		HotelmenuBack.showBill();
	}

}
