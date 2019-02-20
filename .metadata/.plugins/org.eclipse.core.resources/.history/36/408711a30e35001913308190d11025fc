package stream.assign_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import stream.News;
public class FindNewsId {
	public static void main(String[] args) {
		List<News> list = new ArrayList<>();
		list.add(new News(111,"mirza","prashant","good"));
		list.add(new News(112,"beg","sai"," very good"));
		list.add(new  News(111,"mirza","krishna","good"));
		list.add(new News(113,"shreyas","krishna","awesome"));
		list.add(new News(114,"thr","mahesh","wrost"));
		list.add(new News(115,"onkr","sasi","awesome"));
		list.add(new News(111,"mirza","onkar","good"));
	/*int list1=list.stream().max(map(News::getComment).count().get();
		System.out.println(list1);
	
		Stream.of(list)
	      .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Comparator.comparing(News::getComment))
	      .ifPresent(System.out::println);*/
		String mostRepeatedWord 
	    = list.stream()
	          .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
	          .entrySet()
	          .stream()
	          .map((News::getComment)
	        	 .Comparator.comparing()
	        		     .get()
	        	          .getKey();
	          System.out.println(mostRepeatedWord);
	          
	}
}
