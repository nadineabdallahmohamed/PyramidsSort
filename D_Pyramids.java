package PyramidsSort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;





public class D_Pyramids {
	
	public List<Sorted_Pyramids.Sort> readcsv(String path) throws FileNotFoundException  {
		BufferedReader br=new BufferedReader(new FileReader(path));
		String line="";
		List<Sort> p_list=new LinkedList<Sort>();
		
		
		try {
			 line=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(line!=null)
			System.out.println(line);
		do
		{   try {
			line=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			if(line!=null)
			{
				
			//System.out.println("Line After reading"+"  "+line);
			String [] parts=line.split(",");
			if (parts[7].isEmpty()) {
				
				p_list.add(new Sort(parts[0],parts[2],parts[4],Double.parseDouble("20")));
				
			}
			else
				
			  {
				p_list.add(new Sort(parts[0],parts[2],parts[4],Double.parseDouble(parts[7])));
				
			  }
		}}while(line!=null);
		
	return p_list;   	
	}
	
public Sort createpyramid(String [] data)
	
	{
		return new Sort(data[0],data[2],data[4],Double.parseDouble(data[7]));
		
	}
    

}
