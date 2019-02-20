package stream.assign_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import stream.Traders;
public class TradersFromPune {
	public static void main(String[] args) {
	ArrayList<Traders> list=new ArrayList<>();
	list.add(new Traders("mirza","pune"));
	list.add(new Traders("pooja","banga"));
	list.add(new Traders("shreyas","hydra"));
	list.add(new Traders("prashant","pune"));
	List<Traders> list1=list.stream()
			.filter(p->p.getCity()=="pune")
			.sorted(Comparator.comparing(Traders:: getName))
			.collect(Collectors.toList());
	list1.forEach(System.out::println);
	
}

}
