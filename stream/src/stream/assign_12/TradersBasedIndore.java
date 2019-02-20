package stream.assign_12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import stream.Traders;

public class TradersBasedIndore {
	public static void main(String[] args) {
		ArrayList<Traders> list=new ArrayList<>();
		list.add(new Traders("mirza","indore"));
		list.add(new Traders("pooja","banga"));
		list.add(new Traders("shreyas","indore"));
		list.add(new Traders("prashant","pune"));
		List<Traders> list1=list.stream()
				.filter(p->p.getCity()=="indore")
				.sorted(Comparator.comparing(Traders:: getName))
				.collect(Collectors.toList());
		list1.forEach(System.out::println);
	}
}
