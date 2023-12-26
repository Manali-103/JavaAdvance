package day2;

public class PrinterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Printer prn = new Printer();
       //prn.setContent("Good");
       prn.print();
       prn.print("******");
       prn.print("$$$$$$$$");
       Printer prn2 = new Printer ("Good Night");
       prn2.print();
	}

}
