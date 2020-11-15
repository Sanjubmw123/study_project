package Collections_project;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ALL_ABOUT_SETS {

	public static void main(String[] args) {
//sorted set//hash set//tree set//(topics)
		Set <String>set=new HashSet<String>();
		    set.add("sanjay");
		    set.add("ajita");
		    set.add("sanjay");
		    set.add("jay");
		System.out.println("*****"+set);
		
		Set <String>set1=new TreeSet<String>();
	    set1.add("sanjay");
	    set1.add("ajita");
	    set1.add("sanjay");
	    set1.add("jay");
	System.out.println("***********"+set1);
	
	Set <String>set2=new LinkedHashSet<String>();
	set2.add("sanjay");
    set2.add("ajita");
    set2.add("sanjay");
    set2.add("jay");
System.out.println("*********"+set2);

Set <Integer>num=new HashSet<Integer>();
    num.addAll(Arrays.asList(new Integer[] {1,3,0,4,5,6,7,10}));
    
    Set <Integer>num1=new HashSet<Integer>();
    num1.addAll(Arrays.asList(new Integer[] {1,2,4,6,9}));
    
    Set <Integer>union=new HashSet<Integer>(num);
    union.addAll(num1);
    System.out.println(union);//union all
    
    Set <Integer>intersect=new HashSet<Integer>(num);
    intersect.retainAll(num1);
    System.out.println(intersect);//inner join//
    
    Set <Integer>difference=new HashSet<Integer>(num);
    difference.removeAll(num1);
    System.out.println(difference);//common data gone...only remains
    
    
	}

}
