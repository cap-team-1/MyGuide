package stream.assign_9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import stream.Traders;

public class UniqueCities {
	public static void main(String[] args) {
		ArrayList<Traders> list=new ArrayList<>();
		list.add(new Traders("mirza","indore"));
		list.add(new Traders("pooja","banga"));
		list.add(new Traders("shreyas","indore"));
		list.add(new Traders("prashant","pune"));
		/*List<Traders> list1=list.stream().distinct()
				.collect(Collectors.toList());
		list1.forEach(System.out::println);*/
		
		List<String> list1=list.stream()
				.map(Traders::getCity).distinct()
				.collect(Collectors.toList());
		list1.forEach(System.out::println);
	}
}
