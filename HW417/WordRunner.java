//A+ Computer Science
// www.apluscompsci.com

//comparable example one

import static java.lang.System.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word x = new Word("dog");
		Word y = new Word("cat");
		System.out.println(x.compareTo(y));
		
		//make a list of Word
		//call Collections.sort() and sort the list
		//print the list
		
		Comparable []list= new Comparable[4];
		list[0] = new Word ("Banana");
		list[1] = new Word ("Apple");
		list[2] = new Word ("Doughnut");
		list[3] = new Word ("Carrot");
		
		Arrays.sort(list);
		
		for (int i = 0; i < list.length; i++) {
		    System.out.print("\n" + list[i]);
		  }
		
  }
}