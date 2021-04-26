package bg.swift.lectures.casts;

/**
 * Created by Rossen on 30.01.2016
 */
public class ExplicitCasts {
    public static void main(String[] args) {
        int i = (int) 3.7;
        byte b = (byte) 200;
		
		// 2
		double myDouble = 5.1d;
		System.out.println(myDouble);
		long myLong = (long)myDouble;
		System.out.println(myLong);
		myDouble = 5e9d; // 5 * 10^9
		System.out.println(myDouble);
		int myInt = (int) myDouble;
		System.out.println(myInt); 
		System.out.println(Integer.MAX_VALUE);		
		
		// 3
		long myLong = Long.MAX_VALUE;
		int myInt = (int)myLong;
		System.out.println(myLong);
		System.out.println(myInt);
		
		// 4
		float heightInMeters = 1.74f;
		double maxHeight = heightInMeters;
		double minHeight = (double) heightInMeters;
		float actualHeight = (float) maxHeight;
//		float maxHeightFloat = maxHeight; // ?
    }
}
