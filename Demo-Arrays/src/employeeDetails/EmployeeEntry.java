package employeeDetails;

public class EmployeeEntry {
			 
		     public static void main(String[] args){
			
				Employee e = null;
				City a = new City ();
				a.setName("KOLKATA");
				
				Country co = new Country();
				co.setName("INDIA");
			     co.setCity(a);
			    Address ad = new Address();
			    ad.setline("ESPLANADE");
			     ad.setCountry(co);
			 
			     e = new Employee();
			     e.setName("SUBHAM");
			     e.setAddress(ad);
			    e.displayDetails(e);
		
		 		
	 		
				
		 		a.setName("NEW YORK");
				co.setName("USA");
			    co.setCity(a);
			    ad.setline("BROOKLYN");
			    ad.setCountry(co);
			    
			    e.setName("ADAM");
			    e.setAddress(ad);
			    e.displayDetails(e);
			    
			    
		 		
		 		
		 		a.setName("BRUSSELS");
				co.setName("BELGIUM");
			    co.setCity(a);
			    ad.setline("DE BRUYNE ROAD");
			    ad.setCountry(co);
			    
			    e.setName("KEVIN");
			    e.setAddress(ad);
			    e.displayDetails(e);
			    
			    
		 		
		 		
		 		a.setName("TURIN");
				co.setName("ITALY");
			    co.setCity(a);
			    ad.setline("PIZZA ROAD");
			    ad.setCountry(co);
			    
			    e.setName("ROSSI");
			    e.setAddress(ad);
			    e.displayDetails(e);
			    
			   
		 		a.setName("ETIENNE");
				co.setName("FRANCE");
			    co.setCity(a);
			    ad.setline("CHATEAU");
			    ad.setCountry(co);
			    
			    e.setName("GRIEZMANN");
			    e.setAddress(ad);
			    e.displayDetails(e);
			    
}
}