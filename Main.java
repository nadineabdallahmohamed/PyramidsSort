package PyramidsSort;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		List<Sort> pyramids =new LinkedList<Sort>();
		D_Pyramids pr = new D_Pyramids();
		try {
			 pyramids = pr.readcsv("C:\\java\\pyramids_sort.csv");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		  Collections.sort(pyramids, new Pyramidsort().reversed());
		  
		  int i =1;
	        for(Sort p: pyramids) {
	           System.out.println("#"+(i++)+","+p.getPharaoh()+"," + p.getModern_name()+","+p.getSite()+","+p.getHeight());}
	        Map < String, Integer > NumOfSites= new LinkedHashMap<>();
	         for(Sort p: pyramids)
	         {
	             String site = p.getSite();
	             Integer counter = NumOfSites.get(site);
	             if (counter == null )
	             { 
	                 counter =1;
	             }
	             else {
	                 counter++;
	             } 
	             NumOfSites.put(site, counter);
	         } 
	                
	           System.out.println("\n"+NumOfSites);    

	}

}
