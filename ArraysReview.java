//importing arrays and collections class
import java.util.Arrays;
import java.util.Collections;

public class ArraysReview {
	public static void main(String[] args) {

	
	//initializing array of integers
	int[] price = {54, 159, 35, 57, 52, 49, 59, 33, 48, 33, 40, 14, 58, 37, 47, 33, 29, 25, 25};
	
	//finding the minimum number
	//int min = Collections.min(Arrays.asList(price));
	
	Arrays.sort(price);
	
	//finding the average ticket price
	int sum = 0;
	
	for(int i=0; i < price.length ; i++)
  		 sum = sum + price[i];
   	double average = sum / price.length;
   	
   	//finding the median
   	double median;
   	
	if (price.length % 2 == 0)
    	median = ((double)price[price.length/2] + (double)price[price.length/2 - 1])/2;
	else
    	median = (double) price[price.length/2];
   	
	
	//printing out minimum, maximum, average and median
	System.out.println("The average cheapest ticket price is: " + average);
	System.out.println("The median ticket price is: " + median);
	System.out.println("Minimum average ticket price: " + price[0]);
	System.out.println("Maximum average ticket price: " + price[18]);
	
	}
}

