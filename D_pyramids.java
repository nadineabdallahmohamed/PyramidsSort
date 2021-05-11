package SortedPyramids;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;





public class PyramidDAO {
	
	public List<Pyramidwithsort.Pyramid> readcsv(String path) throws FileNotFoundException  {
		BufferedReader br=new BufferedReader(new FileReader(path));
		String line="";
		List<Pyramid> p_list=new LinkedList<Pyramid>();
		
		
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
				
				p_list.add(new Pyramid(parts[0],parts[2],parts[4],Double.parseDouble("20")));
				
			}
			else
				
			  {
				p_list.add(new Pyramid(parts[0],parts[2],parts[4],Double.parseDouble(parts[7])));
				
			  }
		}}while(line!=null);
		
	return p_list;   	
	}
	
public Pyramid  createpyramid(String [] data)
	
	{
		return new Pyramid(data[0],data[2],data[4],Double.parseDouble(data[7]));
		
	}
    

}
