package lab01;

public class TestStock {
public static void main(String[] args) {
	Stock a = new Stock("LKSS", "Limerick Software Solutions");

	System.out.println("symbol: " + a.symbol);
	System.out.println("name: " + a.name);
	System.out.println("percentage change: " + a.getChangePrecent(79.45, 79.65));
	}
}
