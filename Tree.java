package collection_Examples;

import java.util.TreeMap;
public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
		  TreeMap<Employee,String> etree = new TreeMap<Employee,String>();
		  
		  etree.put(new Employee(1,"suhaas"), "Manager");
		  etree.put(new Employee(2,"rajeev"), "TeamLader");
		  
		  
		  System.out.println(etree);
		  
    }catch(Exception e) {
    	System.out.println(e.getMessage());
    }
	}

}