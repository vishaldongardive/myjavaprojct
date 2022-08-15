package collectionSudy;

import java.util.ArrayList;

public class ArraylistStudy {

	public static void main(String[] args) {
		
			ArrayList al=new ArrayList();
			al.add("velocity");
			al.add(199);
			al.add(99.99);
			al.add(null);
			al.add(null);
			al.add("velocity");
			al.add(true);
			al.add('A');
			System.out.println(al);
			System.out.println(al.size());
			System.out.println(al.get(0));
			System.out.println(al.indexOf('A'));
			System.out.println(al.indexOf("velocity"));
			System.out.println(al.lastIndexOf("velocity"));
			System.out.println(al.contains("velocity"));
			System.out.println(al.remove(0));
			System.out.println(al);
			al.add(1,"pune");
			System.out.println(al);
            System.out.println(al.remove(null));
            System.out.println(al);
            System.out.println("=================");
            System.out.println(al.get(0));
            System.out.println(al.get(1));
            System.out.println(al.get(2));
            System.out.println(al.get(3));
            System.out.println("==============");
            {
            	System.out.println(al.get(1));
            }
            System.out.println("=============");
            for (int i=0;i<al.size()-1;i++)
            {
            	System.out.println(al.get(i));
            }
		}
	}
            
		
	

	


