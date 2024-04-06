package week4codingproject;

public class week4codingproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		//(i.e. do not use ages[7] in your code). Print the result to the console.  
       
		
		int result = ages[ages.length-1] - ages[0];
		System.out.println("1A) Subtracting first from last element: " + result);
		
		
		
		// b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
         
		int[] ages2 = {12, 17, 29, 18, 87, 63, 3, 14, 106};
		
		
		
		// i. Make sure that there are 9 elements of type int in this new array. 
		// yes :)

		// ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2).
		
		
		
		 result = ages2[ages2.length-1] - ages2[0];
		System.out.println("1Bii.) Subtracting first from last element: " + result);
		
	  
		
		

		// iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		
		//  Basically the syntax for coding an array with any amount of elements is the same-  
		//  for example, you can always use ages[0] to find the first element, and
		//  you can always use ages.length-1 to access the last element.
		
		

		// c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
        
		   int sum = 0; 
		   for (int i = 0; i < ages2.length; i++) {
			sum += ages2.length;   
			   
		    }
		
		    int average = sum/ages2.length;
		    System.out.println("1C) Using a loop to calculate the average age: " + average); 
            
 
		
		
		
      //2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		
		
		

	//	a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		average = sum/names.length;
		System.out.println("2A) Average number of letters per name: " + average);
		
	
	

		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
         
		System.out.println("2B) Concatenating all the names in the names array together: ");
		for (int i = 0; i < names.length; i++) {
			System.out.print( names[i] + " ");
		}
		
	     
		
		
		//3. How do you access the last element of any array?
			//	We can use the name of the array and access it with the .length modifier - since we start 
			//	counting the first element at number 0, we use length-1.
			//	ex: ages.length-1

		//4. How do you access the first element of any array? 
			//	Since we start counting at element number 0, you can call on element 0
			//	ex: ages[0] 
						

		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		        
		       System.out.println("5) Writing a loop to iterate over the names array, with the namelengths printed out: ");
				 int[] nameLengths = new int[6];
				 
					for (int i = 0; i < names.length; i++) {
						nameLengths[i] += names.length;
						System.out.println(names[i].length());
					}
			 
		
		
		
	//	6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
        sum = 0;
		 for (int i = 0; i < nameLengths.length; i++) {
		       sum += nameLengths[i];	 
		 }
		 System.out.println("6) Calculates the sum of all the elements in an array: " + sum);
		
		
		
		
		
    // 7. 
		
		String wordRepeated = concatenateWord("Hello", 3);   
		System.out.println("7) Returns a Word Concatenated n times: " + wordRepeated);
		
		
		
		
		
		
	// 8.  
		
		String firstName = "Beyonce";
		String lastName = "Knowles";
		System.out.println("8) Returns a full name: " + returnFullName(firstName, lastName));
		
		
		
		
		
		
		
	// 9. 
		
		// int sumAges2 = 0;
		//  ages2 = {12, 17, 29, 18, 87, 63, 3, 14, 106};
		 System.out.println("9) Returns true if sum of all the ints in an array is greater than one hundred: " + isGreaterThanHundred(ages2));
		
       
		
	
	
	
		
	//10.
		
	  double[] numbers  = {12.09, 17.08, 29.99, 18.76, 87.32, 63.00, 3.00, 14.01, 106.09};
	  System.out.println("10) Returns the average of all the doubles in an array: " + returnsAverageOfDoubleArray(numbers));
	
         

	
	
	
	   
	
	//11.
		
      double[] numbers2 = {13.00, 47.9, 28.3, 26.77, 56.00, 109.2, 43.22};

      System.out.println("11) Returns true if the average of the first array is greater than the average of the second array: " + compareAveragesOfTwoArrays(numbers, numbers2));

         

       
       
    //12. 
       
     	boolean isHotOutside = true;
	    double moneyInPocket = 11.00;
	     System.out.println("12) Returns true if it is hot outside and there is more than $10.50 in your pocket: " + willBuyDrink(isHotOutside, moneyInPocket));
	    
	     
	
	     
	     //13.
	     
			
	    System.out.println("13.) My own method that returns the amount of music tuition owed for the month:  You owe $" + calculatesMusicTuition(65, 5) + " for music lessons this month.");
					
		  

	 

	 }  // end of main*************
		
			
		
		
		
	///////////////////////////////////////////////////////////////////	
		
		//METHODS!! BELOW
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	
	
		public static String concatenateWord(String word, int n ) {
			String result = " "; 
			for (int index = 0; index < n; index++) {
				result += word;
			}
			return result;
		}
		
		
		
		
	//	8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		
	

		
		public static String returnFullName(String firstName, String lastName) {
			String fullName =  firstName + " " + lastName;
			return fullName;
		}
		
		
		
	//	9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.


		
	     public static boolean isGreaterThanHundred(int[] ages2) {
		   int sumAges2 = 0;
	       for (int i = 0; i < ages2.length; i++) {
		   sumAges2 += ages2[i]; 
       	}
	   return (sumAges2 > 100) ;
  	  
	    }
	     
		
	
	//	10. Write a method that takes an array of double and returns the average of all the elements in the array.

		
	
         public static double returnsAverageOfDoubleArray(double[] numbers) {
     	  double sum = 0;
			for (int i = 0; i < numbers.length; i++) {
				 sum += numbers[i];
				
			}
      
			double average = sum/numbers.length;
		   return average;
          }
			
		
		
		
		
		// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

		
		
		public static boolean compareAveragesOfTwoArrays (double[] numbers, double[] numbers2) {
			  double sum = 0;
			  
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
		
		
		
		
		
		
		// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
        
		
	 
		 public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
				if (isHotOutside == true  &&  moneyInPocket > 10.50) {
					
					 return true; 
				}
				else {
					return false;
				}
		    }
	  
		
		
			//	13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		    //			I am a music teacher and I teach private violin and viola lessons. I wrote a method that takes two ints- number of lessons for the month, and lesson prices, 
			//		and multiplies them.  This method returns an integer - the total tuition owed for the month.
					
					
		
     		public static int calculatesMusicTuition(int lessonCost, int numberOfLessons) {
			
			int sum = numberOfLessons * lessonCost;
			return sum; 
		  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


