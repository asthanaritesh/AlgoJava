package CoreJava.PrimVsRef;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimVsRef {
	int iExample;
	int[] iArrExample;
	ArrayList<Integer> iListExample;
	String sExample;
	
	public PrimVsRef(int i, int[] iArr, ArrayList<Integer> iList, String s) {
		iExample = i;
		iArrExample = iArr;
		iListExample = iList;
		sExample = s;
	}
	
	public static int someMethod (int i, int[] iArr, String str, StringBuilder sb, ArrayList<Integer> list, Sample sam) {
		int iLocal = i; iLocal = 2;
		int[] iArrLocal = iArr;	iArrLocal[0]=5;iArrLocal[1]=6;iArrLocal[2]=7;iArrLocal[3]=8;
		str = "MeChanged";
		String strLocal = str; strLocal = "Changed";
		StringBuilder sbLocal = sb; sbLocal.append(" sb Changed");
		ArrayList<Integer> listLocal = list; listLocal.add(15); listLocal.add(16); listLocal.add(17); listLocal.add(18); 
		Sample samLocal = sam; samLocal.iSample=3;
		Sample samNew = new Sample(iLocal, strLocal, sbLocal, iArrLocal, listLocal);
		samLocal = samNew;
		return iLocal;
	}
	
	public static void main(String[] args) {
		int iMain1 = 1;
		String strMain1 = "java";
		StringBuilder sbMain = new StringBuilder("sb Java");
		int[] iArrMain1 = {1,2,3,4};
		int[] iArrMain2 = new int[]{9,7,5,3,6};
		ArrayList<Integer> iListMain= new ArrayList<Integer>(); iListMain.add(11); iListMain.add(12); iListMain.add(13); iListMain.add(14);
		Sample samMain = new Sample(iMain1, strMain1, sbMain, iArrMain1, iListMain);
		int iMain2 = someMethod(iMain1, iArrMain1, strMain1, sbMain, iListMain, samMain);
		System.out.println("After Function call, value of the variables are:");
		System.out.println("iMain1 is: "+ iMain1);
		System.out.println("iArrMain1 is: "+ Arrays.toString(iArrMain1));
		System.out.println("strMain1 is: "+ strMain1);
		System.out.println("sbMain is: "+ sbMain);
		System.out.println("iListMain is: "+ iListMain);
		samMain.print();
	}
}
