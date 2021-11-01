
public class Main {

	public static void main(String[] args) {
		Mouse1 m1 = new Mouse1();
		
		/* m1. allows me to see everything that Mouse1 can do 
		   because of the inheritance of the "Mouse" class
		*/
		m1.leftClick();
		m1.rightClick();
		m1.scrollDown();
		m1.scrollUp();
		
		//m1.texture 	 	// Mouse1 also it's own feature
		
		
		// same applies for Mouse2
		Mouse2 m2 = new Mouse2();
		
		m2.leftClick();		// Mouse2 has the general properties of Mouse1
		m2.rightClick();
		m2.scrollDown();
		m2.scrollUp();
		
		m2.connect();		// Mouse2 also has it's own feature 
		
		
		// same applies for Mouse3 
		Mouse3 m3 = new Mouse3(); 
		
		m3.leftClick();		// Mouse2 has the general properties of Mouse1
		m3.rightClick();
		m3.scrollDown();
		m3.scrollUp();
		
		//m3.ambidextrous  	// Mouse3 also has it's own features
	}

}
