package Collections_project;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class All_AboutLinkedHash_treeMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String>linkhash=new LinkedHashMap<Integer,String>();
               linkhash.put(0, "sanjay");
               linkhash.put(1, "sunita");
               linkhash.put(2, "jyoti");
               linkhash.put(4, "tom");
               linkhash.put(7, "sanjay");
               System.out.println(linkhash);
              linkhash.replace(0, "ajita");
                      
               System.out.println(linkhash);
               for(int i=0;i<linkhash.size();i++) {
            	   System.out.println(linkhash.get(i));
               }
                   for (Entry<Integer, String> str :linkhash.entrySet() ) {
                	   System.out.println(str.getKey()+" "+str.getValue());                
					
				}
                   //converting hashmap to arraylist
                   List<Integer>list=new ArrayList<Integer>(linkhash.keySet());
                   for (Integer num : list) {
                	   System.out.println(num);
                   }
                   List<String>list1=new ArrayList<String>(linkhash.values());
                   for (String string : list1) {
                	   System.out.println(string);
					
				}
                   
                TreeMap<String,Integer>map=new  TreeMap<String,Integer>(); 
                   map.put("sanjay", 111);
                   map.put("jay", 11); 
                   map.put("ajita", 1); 
                   map.put("bishal", 1); 
                   map.put("sanjay", 111); 
                   map.put("god", 777); 
                   
                System.out.println(map); 
                System.out.println(map.headMap("bishal"));//before that
                  System.out.println(map.tailMap("god")); // after that
                   
                  for (Entry string : map.entrySet()) {
                	  System.out.println(string.getKey()+" "+string.getValue());
					
				} 
                   
                  TreeMap<Integer,String>map1=new  TreeMap<Integer,String>(); 
                  
                     map1.put(1000, "jay");
                     map1.put(10000, "bob");
                     map1.put(10, "tom");
                     map1.put(20, "tom");
                     map1.put(100, "amrit");
                     
                  
                  System.out.println(map1);
                  System.out.println("*******************");
                  System.out.println(map1.headMap(100));
                  System.out.println(map1.tailMap(100));
                  
                  for (Entry string1 : map1.entrySet()) {
                	  System.out.println(string1.getKey()+" "+string1.getValue());
					
				}
                  
	}

}
