package week4codingproject;

import java.util.ArrayList;
import java.util.List;

public class Week4Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	   
	
	
		
	   List<String> listOfNames = new ArrayList<String>();
	       listOfNames.add("Becky");
	       listOfNames.add("Tobie");
	       listOfNames.add("Sera");
	       listOfNames.add("Cori");
	       listOfNames.add("Leina");
	       
		System.out.println(listOfNames);
		System.out.println(halfTheList(listOfNames));
	
		
	   
	
	}	// end of main 
	
	
	
	public static List<String>  halfTheList(List<String> listOfNames) {
		List<String> resultList = new ArrayList<>();
		
		for (int index = 0; index < listOfNames.size(); index++) {
			if (!(index % 2 == 0)) {
				resultList.add(listOfNames.get(index));
			 }
		  }
		return resultList;
	   }
	   
	
	
	private static List< String > returnValuesForKeysStartingWithA( Map < String,  String > dictionary) {

		List< String > resultList = new ArrayList<>();

		Set< String > keySet = dictionary.keySet() ;

		for ( String key : keySet ) {

		if ( key.toLowerCase().charAt(0) == 'a' ) {

		resultList.add(dictionary.get( key ));

		}

		}

		return resultList;

		}
	
	
	
	
	
	
	
	
	
	
} // end of class