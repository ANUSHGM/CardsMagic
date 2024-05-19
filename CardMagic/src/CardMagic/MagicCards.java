package CardMagic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Listordering orderit = new Listordering();

		 String c1 = "2\u2663"; 
		 String c2 = "9\u2660";
		 String c3 = "8\u2666";
		 String c4 = "10\u2665";
		 String c5 = "K\u2666";
		 String c6 = "9\u2663";
		 String c7 = "J\u2665";
		 String c8 = "A\u2665";
		 String c9 = "7\u2665";
		 String c10= "2\u2665";
		 String c11= "8\u2665";
		 String c12= "3\u2665";
		 String c13= "4\u2665";
		 String c14= "9\u2665";
		 String c15= "6\u2665";
		 String c16= "K\u2660";
		 String c17= "J\u2663";
		 String c18= "Q\u2660";
		 String c19= "8\u2663";
		 String c20= "A\u2660";
		 String c21= "7\u2666";
		 
//		 System.out.println(c1+c2+c3+c4+c5+c6+c7+c8+c9+c10+c11+c12+c13+c14+c15+c16+c17+c18+c19+c20+c21);
		 
		 List<String> cardListA = new ArrayList<>();
		 List<String> cardListB = new ArrayList<>();
		 List<String> cardListC = new ArrayList<>();
		 
		 cardListA.add(0, c1);
		 cardListA.add(1, c2);
		 cardListA.add(2, c3);
		 cardListA.add(3, c4);
		 cardListA.add(4, c5);
		 cardListA.add(5, c6);
		 cardListA.add(6, c7);


		 cardListB.add(0, c8);
		 cardListB.add(1, c9);
		 cardListB.add(2, c10);
		 cardListB.add(3, c11);
		 cardListB.add(4, c12);
		 cardListB.add(5, c13);
		 cardListB.add(6, c14);
		 
		 cardListC.add(0, c15);
		 cardListC.add(1, c16);
		 cardListC.add(2, c17);
		 cardListC.add(3, c18);
		 cardListC.add(4, c19);
		 cardListC.add(5, c20);
		 cardListC.add(6, c21);
		    
		 
		 List<String> dummyCardListA = new ArrayList<>();
		 List<String> dummyCardListB = new ArrayList<>();
		 List<String> dummyCardListC = new ArrayList<>();
		 List<String> wholeCardList  = new ArrayList<>();

		System.out.println("Set A \t\t Set B \t\t Set C");
		 
//		for (String x : cardListA) {
//			System.out.println(x);
//		}
//		for (String x : cardListB) {
//			System.out.println(x);
//		}
//		for (String x : cardListC) {
//			System.out.println(x);
//		}
		
		for (int i = 0 ; i<cardListA.size();i++) {
			System.out.println(cardListA.get(i) +"\t\t  "+cardListB.get(i)+"\t\t  "+cardListC.get(i));
		}
//first time asking 		
		System.out.println("THINK of a particular card and ENTER the name of the SET which it belongs to : ");
		System.out.println("\n");
		String option1 = scanner.nextLine();
		
		switch (option1.toUpperCase()) {
		case "A":
			wholeCardList = orderit.orderLists(cardListB, cardListA, cardListC);
			break;

		case "B":
			wholeCardList = orderit.orderLists(cardListA, cardListB, cardListC);
			break;
		case "C":
			wholeCardList = orderit.orderLists(cardListA, cardListC, cardListB);
			break;
		default:
			System.out.println("Invalid Response");
			break;
		}
		
		
		for (int i = 0;i<19; ) {
			dummyCardListA.add(wholeCardList.get(i));
			i=i+3;
		}
		for (int i = 1;i<20; ) {
			dummyCardListB.add(wholeCardList.get(i));
			i=i+3;
		}
		for (int i = 2;i<21; ) {
			dummyCardListC.add(wholeCardList.get(i));
			i=i+3;
		}

		System.out.println("Set A \t\t Set B \t\t Set C");

		for (int i = 0 ; i<dummyCardListA.size();i++) {
			System.out.println(dummyCardListA.get(i) +"\t\t  "+dummyCardListB.get(i)+"\t\t  "+dummyCardListC.get(i));
		}
		
		
		wholeCardList.clear();
//second time asking 
		System.out.println("Again ENTER the name of the SET which your chosen card belongs to : ");
		System.out.println("\n");

		String option2 = scanner.nextLine();
		switch (option2.toUpperCase()) {
		case "A":
			wholeCardList = orderit.orderLists(dummyCardListB, dummyCardListA, dummyCardListC);
			break;

		case "B":
			wholeCardList = orderit.orderLists(dummyCardListA, dummyCardListB, dummyCardListC);
			break;
		case "C":
			wholeCardList = orderit.orderLists(dummyCardListA, dummyCardListC, dummyCardListB);
			break;
		default:
			System.out.println("Invalid Response");
			break;
		}
		dummyCardListA.clear();
		dummyCardListB.clear();
		dummyCardListC.clear();
		
//third time asking		
		for (int i = 0;i<19; ) {
			dummyCardListA.add(wholeCardList.get(i));
			i=i+3;
		}
		for (int i = 1;i<20; ) {
			dummyCardListB.add(wholeCardList.get(i));
			i=i+3;
		}
		for (int i = 2;i<21; ) {
			dummyCardListC.add(wholeCardList.get(i));
			i=i+3;
		}
		System.out.println("Set A \t\t Set B \t\t Set C");

		for (int i = 0 ; i<dummyCardListA.size();i++) {
			System.out.println(dummyCardListA.get(i) +"\t\t  "+dummyCardListB.get(i)+"\t\t  "+dummyCardListC.get(i));
		}
		wholeCardList.clear();
		
		System.out.println("Finally ENTER the name of the SET which your chosen card belongs to : ");
		System.out.println("\n");

		String option3 = scanner.nextLine();
		switch (option3.toUpperCase()) {
		case "A":
			wholeCardList = orderit.orderLists(dummyCardListB, dummyCardListA, dummyCardListC);
			break;

		case "B":
			wholeCardList = orderit.orderLists(dummyCardListA, dummyCardListB, dummyCardListC);
			break;
		case "C":
			wholeCardList = orderit.orderLists(dummyCardListA, dummyCardListC, dummyCardListB);
			break;
		default:
			System.out.println("Invalid Response");
			break;
		}
		dummyCardListA.clear();
		dummyCardListB.clear();
		dummyCardListC.clear();
		
//displaying the thought card. 
		System.out.println("So the card you thought was .....  "+ wholeCardList.get(10));

	}

}
