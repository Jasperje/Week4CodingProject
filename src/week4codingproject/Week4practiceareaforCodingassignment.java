package week4codingproject;

public class Week4practiceareaforCodingassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//10. Write a method that takes an array of double and returns
		//the average of all the elements in the array.

	 
		

           
			
			double[] numbers  = {12.09, 17.08, 29.99, 18.76, 87.32, 63.00, 3.00, 14.01, 106.09};
			double[] numbers2 = {13.00, 47.9, 28.3, 26.77, 56.00, 109.2, 43.22};
			
			System.out.println(returnsAverageOfDoubleArray(numbers));
			
	} // end of main 
	
	
          public static double returnsAverageOfDoubleArray(double[] numbers) {
        	  double sum = 0;
  			for (int i = 0; i < numbers.length; i++) {
  				 sum += numbers[i];
  				
  			}
          
  			double average = sum/numbers.length;
			return average;
          }
  			
			
			// THEN ... 11. Write a method that takes two arrays of double and 
			// returns true if the average of the elements in the first array is greater
			// than the average of the elements in the second array.

			public static boolean compareAveragesOfTwoArrays (double[] numbers, double[] numbers2) {
				  double sum = 0;
				  
				  return returnsAverageOfDoubleArray(numbers) > returnsAverageOfDoubleArray(numbers2);
				  
				  
				  
				  
				for (int i = 0; i < numbers.length; i++) {
	  				 sum += numbers[i];
				}
				    double sum2 = 0;
	  				for (int i = 0; i < numbers2.length; i++) {
	  	  				 sum2 += numbers2[i];
	  	  				
			   }
	  				double average = sum/numbers.length;
	  				double average2 = sum2/numbers2.length;
	  				return average > average2;
			   }
			
          
          
          
			
 
	
		 
	



		 

	} // end of class

		
		
		
		
		
		
	

