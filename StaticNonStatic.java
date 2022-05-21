package com.masai;

public class StaticNonStatic {
/*
     Inside java there will be 2 ypes of element
        1.static element
        2.non static element
        
        static element is loaded in ram, non-static element is loaded in hard-disk
        element which is loaded in ram is executed by CPU 
        so to execute the non-static element we need to convert non-satic element to static
        
        
        
        Static Members                                           Non-Static Members
          Belongs to class                                           Belong to Object
		  Can be accessed using                                      Can be accessed using
		  ClassName.memberName                                       objectName.memberName
          Static variable initializes with                           Non-static variable initializes with
          default values at the time of class                        default values at the time of object
          loading.                                                   creation
          All objects of a class share a                             Each object has one local copy of the
          single copy of static variables                            non-static variables.



*/

//         two methods to convert static to non-static
//         initialising as static
//	        by creating object
	
	
	static int i=10;
	int m=1000;
	 public static void main(String[] args) {
		
		 System.out.println(i); //output 10
		 
		 StaticNonStatic d1=new StaticNonStatic();
				 System.out.println(d1.m);
	}
 
 
 
 

}
