package Collections_project;

import java.util.Iterator;
import java.util.LinkedList;

public class All_about_Linked {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Qa");
		list.add("jay");
		list.add("dev");
		list.add("qtp");
		System.out.println(list);
		list.addFirst("begin");
		list.addLast("ending");
		System.out.println(list);
		System.out.println(list.get(4));
		list.set(4, "no long qtp");
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		//also removefirst();removelast();&removeby(index)
		//forloop
		System.out.println("*******************");
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (String string : list) {
			System.out.println(string);
			
		}
		    Iterator<String>it= list.iterator();
		     while(it.hasNext()) {
				String emp=(it.next());
				System.out.println(emp);
	}
	System.out.println("+++++++++++++++++");	
	
	
	
	 
	  
	  int num=0;
	  while(list.size()>num){
		System.out.println(list.get(num)); 
		num++;

		     }
	}

}
