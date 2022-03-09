import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Java_Streams {

	public class test1 {
		// TODO Auto-generated method stub

		// Count the number of names starts with letter "A" in list
		
		//@Test
		public void regular()
		{
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mohsin");
		names.add("Saika");
		names.add("Ansar");
		names.add("Abeeha");
		names.add("Ilhan");
		names.add("Anees");
		names.add("Shazia");
        int count=0;

       for(int i=0;i<names.size();i++)
		{
			String actual= names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		//System.out.println(actual);
		}
       System.out.println(count);
		}

		
		@Test
		public void streamFilter()
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Mohsin");
			names.add("Saika");
			names.add("Ansar");
			names.add("Abeeha");
			names.add("Ilhan");
			names.add("Anees");
			names.add("Shazia");
			
			Long c= names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
			Stream.of("Mohsin","Saika","Ansar","Abeeha","Ilhan","Anees","Shazia").filter(s->s.startsWith("A")).count();
			
			Long d= Stream.of("Mohsin","Saika","Ansar","Abeeha","Ilhan","Anees","Shazia").filter(s->
					{
						s.startsWith("A");
				//		return false;    //Gives 0 filter returns false
						return true;
					}).count();
			System.out.println(d);
			
			//Print all the names of ArrayList
			
			names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
			names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		}

		@Test
		public void streamMap()
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Mohsin");
			names.add("Saika");
			names.add("Ansar");
			names.add("Abeeha");
			names.add("Ilhan");
			names.add("Anees");
			names.add("Shazia");
			
			
			
			
			// Maps Shazia,Abeeha to SHAZIA,ABEEHA
			// Print names having last letter as "a"  with uppercase
			Stream.of("Mohsin","Saika","Ansar","Abeeha","Ilhan","Anees","Shazia").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
			
			//Print names which have first letter as a with uppercase and sorted
			
			List<String> names1= Arrays.asList("Farhan","Furkan","Faizan","Farida","Faisal","Faheem","Fouzia");
			names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
			//Merging two different List
			
			Stream<String> newStream= Stream.concat(names.stream(),names1.stream());
			// newStream.sorted().forEach(s->System.out.println(s));
			
			//Check Faizan is present
			
			boolean flag=newStream.sorted().anyMatch(s->s.equalsIgnoreCase("Faizan"));
			
			//boolean flag=newStream.sorted().anyMatch(s->s.equalsIgnoreCase("Fai11zan"));
			System.out.println(flag);
			Assert.assertTrue(flag);
			
		}
		
		@Test
		public void streamCollect() {
			
			//List
			//new list
			//new list
			
			List<String> ls= Stream.of("Mohsin","Saika","Ansar","Abeeha","Ilhan","Anees","Shazia").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
			collect(Collectors.toList());
			System.out.println(ls.get(0));
		
		
		
		List<Integer> values= Arrays.asList(3,2,2,7,5,1,9,7);
		
		//Print Unique Numbers
		
		// Sort the array --- 3rd index  1,2,3,5,7,9
		
		values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
		
		

		
		
		}
	
 }
}
