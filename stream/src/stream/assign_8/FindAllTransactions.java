package stream.assign_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import stream.Traders;
import stream.Transaction;

public class FindAllTransactions {
public static void main(String[] args) {
	ArrayList<Transaction> list=new ArrayList<>();
	list.add(new Transaction(new Traders("mirza","indore"),2011,100));
	list.add(new Transaction(new Traders("pooja","banga"),2003,1002));
	list.add(new Transaction(new Traders("shreyas","hydra"),2011,1000));
	list.add(new Transaction(new Traders("prashant","bhopal"),2008,15));
	List<Traders> list1=list.stream()
			.filter(p->p.getYear()==2011)
			.sorted(Comparator.comparing(Transaction:: getValue))
			.map(Transaction::getTrader)
			.collect(Collectors.toList());
	list1.forEach(System.out::println);
}
}
