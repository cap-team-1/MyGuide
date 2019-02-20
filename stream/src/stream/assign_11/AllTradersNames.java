package stream.assign_11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import stream.Traders;

public class AllTradersNames {
	public static void main(String[] args) {
		ArrayList<Traders> list=new ArrayList<>();
		list.add(new Traders("mirza","pune"));
		list.add(new Traders("pooja","banga"));
		list.add(new Traders("shreyas","hydra"));
		list.add(new Traders("prashant","pune"));
		List<Traders> list1=list.stream()
				.sorted(Comparator.comparing(Traders:: getName))
				.collect(Collectors.toList());
		System.out.println(list1.toString());
	}

}
