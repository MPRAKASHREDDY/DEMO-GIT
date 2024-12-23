package Collections;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				int val=map.get(ch);
				map.put(ch, val+1);
					
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		Set<Character> keys=map.keySet();
		for(Character ch: keys)
		{
			System.out.println(ch+" "+map.get(ch));
		}
		

	}

}
