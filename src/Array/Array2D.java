package Array;

import java.util.Arrays;

public class Array2D {
	public static void main(String[] args){	
		int[][] int2DArr1 = {{10,20,30}, {40,50,60}, {70,80,90}} ;
		int[][] int2DArr2 = new int[][]{{10,20,30}, {40,50,60}, {70,80,90}} ;
		int[][] int2DArr3 = new int[3][4];
		
		System.out.println("int2DArr1: "+ Arrays.toString(int2DArr1));
		
		for(int i = 0; i < int2DArr1.length; i++){
			System.out.print("\n");
			for(int j = 0; j < int2DArr1[i].length; j++){
				System.out.print("\t"+int2DArr1[i][j]);
			}
		}
		
		System.out.print("\n");
		for(int[] iArr : int2DArr2){
			System.out.print("\n");
			for (int j : iArr){
				System.out.print("\t"+j);
			}
		}
		

	}
}
