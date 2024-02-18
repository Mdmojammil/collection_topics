package Collectiondeom;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		String arr[]= {"dog","cat","elephant"};
		
		for(String value:arr)
		{
			System.out.println(value);
		}
		
		ArrayList<String> a1=new ArrayList(Arrays.asList(arr));
		System.out.println(a1);
		
	}

}
