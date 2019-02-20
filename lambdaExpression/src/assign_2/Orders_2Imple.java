package assign_2;

public class Orders_2Imple {
public static void main(String[] args) {
	Orders_2 order=(amount) ->{
		if(amount >=10000 ) {
			System.out.println("Acceptable");
			}
		else {
			System.out.println("not acceptable");
		}
	};
	order.checkStatus(2000);
}
}
