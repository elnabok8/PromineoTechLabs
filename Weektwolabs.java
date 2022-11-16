
public class Weektwolabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int age=17;
			boolean haslisence=true;
	
	if (age >=16 && haslisence) {
		System.out.println("You can drive!");}
		else {System.out.println ("You cannot drive!");
		
		}
	
	double costOfMilk = 4.44;
	int thirstLevel = 7;
	
	if (costOfMilk<2.50 || thirstLevel>6) {
		System.out.println ("Milk Please!");}
		else {System.out.println ("No Thanks");
	}
	
	int numberOfCookies=20;
	int numberOfChildren=12;
	if (numberOfCookies % numberOfChildren==0) {
		System.out.println(":(");}
		else if (numberOfCookies % numberOfChildren<2) {
			System.out.println("Yes!");}
			else if (numberOfCookies % numberOfChildren<5) {
				System.out.println("Woohoo!");
			}else if (numberOfCookies % numberOfChildren>=5) {
					System.out.println("Jackpot");
				}
				
	String loyaltyMemberStatus="Plantinum";
	double loyaltyMemberDiscount = 0.0;
	
		switch(loyaltyMemberStatus) {
		case "Silver":
		loyaltyMemberDiscount = .1;
		break;
		case "Gold":
		loyaltyMemberDiscount = .15;
		break;
		case "Plantinum":
		loyaltyMemberDiscount = .25;
		break;}
			System.out.println(loyaltyMemberDiscount);

	
	
	
	
	double billTotal=8000.90;
	double adjustedTotal =billTotal - loyaltyMemberDiscount * billTotal;
	
	System.out.println(adjustedTotal);
	if (adjustedTotal>500 ) {
		if (loyaltyMemberStatus== "Silver") {
			loyaltyMemberStatus = "Gold" ;
			}else if (loyaltyMemberStatus == "Gold") {
				loyaltyMemberStatus ="Plantinum";}
		System.out.println (loyaltyMemberStatus);
		
		
		
		String username="tommy123";
		String password="12345";
		if (username.equals("Tommy123") && password=="12345") {
			System.out.println("Access Granted");
	}else {System.out.println ("Access Denied");
	}
	}
	
	
	for (int i = 0; i < 10; i++) {
		System.out.println(i);
	}
					
	
	for (int i=10; i >= 0; i--) {
		System.out.println(i);
		
	}
	
	for (int i=0; i<=100; i+=2) {
		System.out.println(i);
	}
	for (int i=0; i<=100; i++) {
		if (i % 2 ==0) {
			System.out.println(i);
		}
	}
	
	for (int i=0; i<=100; i++) {
		if (i % 2 == 0) {
			System.out.println(i + " " + "even");
		} else {
				System.out.println(i + " " + "odd"); }
			}
		 
	int i = 100;
	while  (i>=0) {
		System.out.println (i + " " + (i % 3));
		i--;
	
	}
	
	} }
	
			
		
	
	

	
	