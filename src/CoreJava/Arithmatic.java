package CoreJava;

public class Arithmatic {
	public static void main(String[] args) {
        int i =100;
        i = i-- - --i;
        System.out.println("\n"+ i);
        i=4;
        int j = (--i - i--)*2;
        System.out.println("i="+i+"\tj="+j);
	}
}
