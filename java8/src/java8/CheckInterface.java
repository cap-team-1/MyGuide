package java8;

import org.junit.Assert;

public class CheckInterface implements I1,I2 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
//I1.super.display();
		Assert.assertEquals(" hi I!"," hi I2");
	}

}
