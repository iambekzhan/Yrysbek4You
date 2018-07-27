package helloinfo;

public class Conversation {

	public static void main(String[] args) {
	    
	    // what is instance of class
	    Hello o = new Hello();
	    o.sayHello();
	    
	    String onename = "Kuzzat" ;
	    o.sayHelloToSomeone(onename);

	    String[] names = new String[] {"Kuzzat","Murodil","Akbar"};
	    o.sayHelloToBunchOfppl(names);
	    
	    
	  }
}
