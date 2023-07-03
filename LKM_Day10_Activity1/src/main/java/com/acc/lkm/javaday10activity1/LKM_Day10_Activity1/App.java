package com.acc.lkm.javaday10activity1.LKM_Day10_Activity1;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ArrayList<String> technologies = new ArrayList<String>(5);
    	 
    	 technologies.add("Python");
    	 technologies.add("Java");
    	 technologies.add("ASP.net");
    	 technologies.add("salesforce");
    	 technologies.add("Generative AI");

         
         System.out.println("Original List");
         for (String str : technologies) {
             System.out.print(str + ", ");
         }

        
         technologies.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

         // Print the sorted list of strings
         System.out.println("\nSorted List");
         for (String str : technologies) {
             System.out.print(str + ", ");
         }
    }
}
