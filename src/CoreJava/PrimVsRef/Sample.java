package CoreJava.PrimVsRef;
import java.util.*;

public class Sample {
	int iSample;
	String sSample;
	StringBuilder sbSample;
	int[] iArrSample;
	ArrayList<Integer> iListSample;	
	public Sample(int i, String s, StringBuilder sb, int[] iArr, ArrayList<Integer> iList) {
		iSample = i;
		sSample = s;
		sbSample =sb;
		iArrSample = iArr;
		iListSample = iList;		
	}
	public void print() {
		System.out.println("Printing the Sample Object:");
		System.out.println("iSample is: "+iSample);
		System.out.println("sSample is: "+sSample);
		System.out.println("sbSample is: "+sbSample);
		System.out.println("iArrSample is: "+ Arrays.toString(iArrSample));
		System.out.println("iListSample is: "+iListSample);
	}
}
