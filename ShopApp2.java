 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Iterator;



public class ShopApp2 {
     boolean loop = false;
	 char secondInput ;
	  double sum = 0;
	 List<String> itemType = new ArrayList<String>();	
	 List<Double> itemPrice = new ArrayList<Double>();	
	 
	 public ShopApp2(boolean Loop) {
		 this.loop =  Loop ;
		
	}

 


public  boolean shoplist() {
	
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Enter an item: ");
	 itemType.add(sc.next());
	 
    System.out.print("enter price: " );
    itemPrice.add(sc.nextDouble());    
    
    
    Collections.sort(itemType);
    Collections.sort(itemPrice);
    System.out.print("Would you like to add another item ?");
    	secondInput= sc.next().charAt(0);
    	if(secondInput == 'n') {
    		loop = true;  
    		System.out.println("Items" + "   "+"\t\t\t"+"Price");
    		
    		for (int i = 0; i <itemPrice.size(); i++) {
    			sum += itemPrice.get(i);
    			
    		}
    		 
    		for (int i = 0 ; i < itemType.size(); i++) {
                	    System.out.println("\n"+ itemType.get(i)+ "\t\t\t\t"+itemPrice.get(i) +" €");
                	    
                	    
                	}
    		System.out.println("     " + "   "+"\t\t\t" + "   ");	
    		System.out.println("     " + "   "+"\t\t\t"+"Total");	
    		System.out.println("     " + "   "+"\t\t\t" + "-----");	
    		System.out.println("     " + "   "+"\t\t\t" + sum + " €");	
    	}
    	 
  
                 
    	
    return loop;

	
}
	

	
	

	
	
	
	}