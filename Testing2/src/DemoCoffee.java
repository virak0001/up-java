
public class DemoCoffee {
	
	public DemoCoffee() {
		Coffee coffee1 = new Cream(new Ice(new Latte()));
		System.out.println(coffee1.getPrice());
		
		Coffee coffee2 = new Cream(new Latte(new Cream()));
		System.out.println(coffee2.getPrice());
		
		Coffee coffee3 = new Ice(new Cream(new Cappuccino()));
		System.out.println(coffee3.getPrice());
		
		Coffee coffee4 = new Ice(new Chocolate(new Mocha()));
		System.out.println(coffee4.getPrice());
		
		Coffee coffee5 = new Ice(new Americano(new Cream()));
        System.out.println(coffee5.getPrice());
        
        Coffee coffee6 = new Cream(new Americano());
        System.out.println(coffee6.getPrice());
		
	}

	public static void main(String[] args) {
		
		new DemoCoffee();

	}

}
