import java.io.*;
import java.util.*;

public class class1 
{
	    public static void main(String[] args)
		{

	    	 Date doj  = new Date(11,12,2013); 
	    	 empdir emp = new empdir("Raj","Ghosh",75000,"a5", doj);
	    	 emp.displayentry();
	    	 doj.displayDate();
	     	
	         doj  = new Date(9,6,2013);
	    	 emp = new empdir("John","Cena",65000,"a5",doj);	    
	         emp.displayentry();	
	         doj.displayDate();
	         
	         doj  = new Date(8,5,2011);
	    	 emp = new empdir("Simran","Setia",85000,"a3",doj);	    
	         emp.displayentry();	
	         doj.displayDate();
	         
	         doj  = new Date(7,6,2014);
	    	 emp =  new empdir("Dev","Bose",3000,"a2",doj);
	    	 emp.displayentry();
	    	 doj.displayDate();
	    	 
	 	     doj  = new Date(12,12,2016);
	    	 emp = new empdir("Jimmy","Singh",700,"b5",doj);
	 		 emp.displayentry();	
	 		 doj.displayDate();
	 		 
	    emp.displaycount();
	   }
	}


