package Collections_project;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap_project {

	public static void main(String[] args) {
		HashMap<Integer,String>hash=new HashMap<Integer,String>();
		hash.put(1, "sanjay");
		hash.put(2, "tom");
		hash.put(3, "sunita");
		hash.put(4, "jyoti");
		System.out.println(hash);
		//to make synconozied map just add collections.
		
	      Map<Integer,String>map=new HashMap<Integer,String>();
	      map.put(5, "ajita");
	      map.put(6, "soyant");
	      map.put(7, "soy");
	      map.put(8, "izzu");
		  Map<Integer,String>syncmap=Collections.synchronizedMap(map);
		  System.out.println(syncmap);
		  
		  //same way emptymap();unsortedEmptymap();singletonmap//also known as immutable map 
		  //only single value ,cant add anymore unsupported exception();   etc....
		  ConcurrentHashMap<String, Integer>chasmap=new ConcurrentHashMap<>();//has to be parameterized
		    // same like other//faster  performance//no null key or value
		  //synochorized  just opposite of concurrent//
	// concurrent doesnt throw cocurrentModificationexception//nice to remember
		System.out.println(hash.get(1));//use entryset to iterate//non-synchorized
		for (Entry<Integer, String> entry:hash.entrySet()) {
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	     hash.remove(2);	
	     System.out.println(hash);
		HashMap<String,Add_Employee>hash1=new HashMap<String,Add_Employee>();	
		Add_Employee emp=new Add_Employee("Tom",32,"admin");
		Add_Employee emp1=new Add_Employee("jay",23,"QA");
		Add_Employee emp2=new Add_Employee("jyoti",21,"cvs");
		Add_Employee emp3=new Add_Employee("sunita",22,"nc-state");
		hash1.put("A", emp);
		hash1.put("B", emp1);
		hash1.put("C", emp2);
		hash1.put("D", emp3);
		for (Entry entry:hash1.entrySet()) {
			String abc=(String) entry.getKey();
			Add_Employee xyz= (Add_Employee) entry.getValue();
			System.out.println(abc + ":  my employee info ");
			System.out.println(xyz.name+" "+xyz.age+" "+xyz.dept);
			
		}
	}

}
