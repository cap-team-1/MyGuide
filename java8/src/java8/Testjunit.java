package java8;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testjunit {
	CheckInterface check ;
 public Testjunit() {
		// TODO Auto-generated constructor stub
		check=new CheckInterface();
	}
	@Test
	public void test() {
		check.display();
	}

}
