package Collections_project;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable_project {

	public static void main(String[] args) {
      Hashtable table=new Hashtable();
      table.put(1, "sanjay");
      table.put(1, "sanjay");//no duplicates values
      table.put(2, "sam");
      table.put(3, "study");
      table.put(4, "hard");//doesnt acceppt null value///throws java.lang execption
      System.out.println(table);
      //creating clone copy which is also called shallow copy
      Hashtable table1=new Hashtable(); 
   table1=  (Hashtable) table.clone();
    System.out.println(table);
    System.out.println(table1);
    table.clear();
    System.out.println(table);
    System.out.println(table1);
    
    Hashtable<String,String> door=new Hashtable<String,String>();//pass any type of generics
    door.put("a", "good");
    door.put("b", "better");
    door.put("c", "best");
    if(door.contains("best"))
    	System.out.println("pass");
    //print all items using enumeration ----elements();
    //when implemented ,must return true....
         Enumeration enr= door.elements();
         while(enr.hasMoreElements()) {//same like has.next
        	 System.out.println(enr.nextElement());//same like next
         }
         System.out.println("*****************");
         Set set=door.entrySet();//using entry set
         System.out.println(set);
         Hashtable<String,String> door1=new Hashtable<String,String>(); 
         door1.put("a", "good");
         door1.put("b", "better");
         door1.put("c", "best");
         if (door.equals(door1))
        	 System.out.println("match");
         //getting key value 
         System.out.println(door1.get("a"));
         //getting hashcode
      
            
         System.out.println(door1.hashCode());//32 bit integer number
         

}}
