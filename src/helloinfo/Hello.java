package helloinfo;

public class Hello {

	public void sayHello() {
	    System.out.println("Saying hello");
	  }
	  
	  

	  
	  // Can a instance method access another instance method in same class?
	  // yes , you can call it direcly by name
	  // Can a instance method access another instance filed in same class?
	    // yes , you can call it direcly by name
	  // Can a instance method access static method in same class?
	      // yes , you can call it direcly by name
	      // yes , you can call it in static way ClassName.staticMethod
	  // Can a instance method access static field in same class?
	        // yes , you can call it direcly by name
	        // yes , you can call it in static way ClassName.staticField
	  // Can a static method access static field in same class? - yes 
	  // Can a static method access static method in same class? - yes 
	  // Can a static method access instance field in same class? - NO 
	  
	  // Inside Constructor ---> It can have any static and non-static memebers
	  // can we call constructor inside a method using this() ? Never!
	  
	  public void sayHelloToSomeone(String name) {
	    //name = "ABC";
	    System.out.println("Saying Hello to "+ name);
	  
	  }    
	//  public void sayHelloToSomeone() {
//	    String name =  "Kuzzat" ; 
//	           name = "ABC";  
//	     System.out.println("Saying Hello to "+ name);
	//
	//}
	  
	  public void sayHelloToBunchOfppl(String[] names) {
	    
	    //String[] names = new String[] {"Kuzzat","Murodil","Akbar"};
	    
	    for (String name : names) {
	      sayHelloToSomeone(name);
	    }    
	  
	  }
	  // WET : WRITE EVERYTHING PRINCIPLE   BAD!!!
	  // DRY : DONT REPEAT YOURSELF         GOOD!!!
	  

	  



}
