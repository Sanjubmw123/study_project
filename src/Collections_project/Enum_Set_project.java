package Collections_project;

import java.util.EnumSet;
import java.util.Iterator;

public class Enum_Set_project {
   //not synochorized//faster//methods implements bitwise arthimetic operations
	
	enum object{
	    movie,cinema,sports,job,faith,love
	
	}
	public static void main(String[] args) {
	EnumSet<object>obj=EnumSet.allOf(object.class);//adding all
	System.out.println(obj);
	
	EnumSet<object>obj1=EnumSet.noneOf(object.class);//dont need any
	System.out.println(obj1);
	
	EnumSet<object>obj2=EnumSet.range(object.cinema,object.job);//adding range
	System.out.println(obj2);
	
	EnumSet<object>obj3=EnumSet.of(object.faith);//if i need to create single
	System.out.println(obj3);
	
	EnumSet<object>obj4=EnumSet.of(object.faith,object.job);//if i need to create multiple
	System.out.println(obj4);
	//add single to it//or add all
	EnumSet<object>num=EnumSet.allOf(object.class);
	EnumSet<object>num1=EnumSet.noneOf(object.class);
	num1.add(object.love);
	System.out.println(num1);
	num1.addAll(num);
	System.out.println(num1);
	
	EnumSet<object>next=EnumSet.allOf(object.class);
	 Iterator<object>it=next.iterator();
	 while(it.hasNext()) {
		 System.out.print(it.next());
		 System.out.print(" * ");//just giving some space
	 }
	 System.out.println("*************");
	//remove single//or remove all
	 EnumSet<object>newobj=EnumSet.allOf(object.class);
	 boolean abc=newobj.remove(object.movie);
	System.out.println(abc);
	boolean xyz=newobj.removeAll(newobj);
	System.out.println(xyz);
	
	System.out.println(newobj);
	
	
	
	
	
}
}