package javatest2;

import java.util.*;
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;++i) {
			array[i] = s.nextInt();
		}
		
		int start = array[0];
		int curMax = start;
		int count = 0;
		for(int i=1;i<n;++i) {
			if(array[i]>curMax) {
				//	还能继续持有
				curMax = array[i];
			} else {
				//	抛出前面的
				count = count+curMax-start;
				//	重新购买
				start = array[i];
				curMax = start;
			}
		}
		count = count+curMax-start;
		System.out.println(count);
	}

}
