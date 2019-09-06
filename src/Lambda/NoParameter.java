package Lambda;

@FunctionalInterface
interface NoParameterInterface {
  //Here is a method with no parameter and return type as String
    public String HelloWorld();
}

public class NoParameter {
	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	     // lambda expression with return type 
	    NoParameterInterface message = () -> {
	    		return "Hello World with No Parameter";
	    	};
	        System.out.println( message.HelloWorld( ));
	  }
	}
