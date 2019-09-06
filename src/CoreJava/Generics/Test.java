package CoreJava.Generics;

class Test<T> 
{ 
    // An object of type T is declared 
    T member; 
    Test(T obj) {  this.member = obj;  }  // constructor 
    public T getObject()  { return this.member; } 
    
    // A Generic static method example 
    static <T> void genericDisplay (T element) 
    { 
        System.out.println(element.getClass().getName() + " = " + element); 
    } 
} 
   
// Driver class to test above 
class Main 
{ 
    public static void main (String[] args) 
    { 
        // instance of Integer type 
        Test <Integer> iObj = new Test<Integer>(15); 
        System.out.println(iObj.getObject()); 
        Test.genericDisplay("kjhg"); 
        
        // instance of String type 
        Test <String> sObj = new Test<String>("GeeksForGeeks"); 
        System.out.println(sObj.getObject()); 
        Test.genericDisplay(1314);
    } 
}