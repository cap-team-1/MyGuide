package stream.assign_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import stream.Fruits;

public class FruitsOfLowCalory {
public static void main(String[] args) {
	List<Fruits> list = new ArrayList<>();
	list.add(new Fruits("Strawberry",150,80,"Red"));
	list.add(new Fruits("Mango",200,200,"Yellow"));
	list.add(new Fruits("Grapes",70,50,"Green"));
	list.add(new Fruits("GreenApple",80,40,"Green"));
	list.add(new Fruits("WaterMelon",120,60,"Red"));
	list.add(new Fruits("Banana",190,20,"Yellow"));
	list.add(new Fruits("Orange",150,80,"Orange"));
	
	List<String> list2=list.stream()
			.filter(p->p.getCalories()<100)
			.sorted(Comparator.comparing(Fruits::getCalories).reversed())
			.map(Fruits::getName)
			.collect(Collectors.toList());
	list2.forEach(System.out::println);
	
	}
}

