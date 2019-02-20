package stream.assign_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import stream.Fruits;

public class ColorWiseName {
public static void main(String[] args) {
	List<Fruits> list = new ArrayList<>();
	list.add(new Fruits("Strawberry",150,80,"Red"));
	list.add(new Fruits("Mango",200,200,"Yellow"));
	list.add(new Fruits("Grapes",70,50,"Green"));
	list.add(new Fruits("GreenApple",80,40,"Green"));
	list.add(new Fruits("WaterMelon",120,60,"Red"));
	list.add(new Fruits("Banana",190,20,"Yellow"));
	list.add(new Fruits("Orange",150,80,"Orange"));
	List<Fruits> list3=list.stream()
			.sorted(Comparator.comparing(Fruits::getColor))
			.collect(Collectors.toList());
	list3.forEach(e->System.out.println("Fruit is "+e.getName()+" Colour is "+e.getColor()));
}
}
