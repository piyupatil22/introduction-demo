package introduction;

import java.util.ArrayList;

public class Arraylistinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Integer> a=new ArrayList<Integer>();
  a.add(24);
 System.out.println(a);
 a.add(38);
  System.out.println(a);
 System.out.println(a.get(1));
  System.out.println(a.size());
  a.add(0, 12);
  System.out.println(a);
 System.out.println( a.contains(12));
  System.out.println("index is"+a.indexOf(38));
	}

}
