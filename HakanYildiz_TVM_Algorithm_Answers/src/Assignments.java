import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Assignments {

	
	public Assignments(){
		//default const
	}
	
	private int checkCountOfA(String word){
	
		int count = 0;
		char[] charArr = word.toCharArray();
		
		for (char c : charArr) {
			
			if(c == 'a'){
				count++;
			}
			
		}
		
		return count;
	}
	
	private String arrayToString(String[] arr){
		
		String res = "Question 1 Output --> ";
		
		for (int i = 0; i < arr.length; i++) {
			res += arr[i] + ",";
		}
		
		res = res.substring(0, res.length() - 1);
		
		return res;
	}
	
	public String sortWords(String[] data){
		
		if(data.length == 0)
		{
			return "Please, You should add real array for sorting!";
		}
		if(data.length == 1){
			return "Your array length should be more than 2!";
		}		
		
		String temp = "";
		for (int i = 0; i < data.length-1; i++) {
			for (int j = 0; j < data.length-i-1; j++) {
				//firstly check, if both of those elements of array include 'a' letter
 				if(data[j].contains("a") && data[j+1].contains("a")){
 					if(checkCountOfA(data[j]) < checkCountOfA(data[j+1])){
 						temp =  data[j+1];	
						data[j+1] = data[j];
						data[j] = temp;		
 					}			
				}
 				else if(data[j].contains("a") && !data[j+1].contains("a")){
 					// do nothing
 	 			}
 				else if(!data[j].contains("a") && data[j+1].contains("a")){
 					temp =  data[j+1];	
					data[j+1] = data[j];
					data[j] = temp;		
 				}
				else{
					//compare strings
					if(data[j].length() < data[j+1].length())
					{
						temp =  data[j+1];	
						data[j+1] = data[j];
						data[j] = temp;
					}
					
				}
			}
		}
	
		return arrayToString(data);
	}
	
	/* Question 2 - Recursive Example */
	public int findSubSqrtOfNumber(int number){
	
		if((int) Math.sqrt(number) == 1 )
		{
			return 2;	
		}
		else if(Math.sqrt(number) >= 1){
			
			int prev = (int) Math.pow((int)Math.sqrt(number) - 1, 2);
			
			System.out.println(number);
			return findSubSqrtOfNumber(prev);
		}
		return number;
		
	}
	
	/* Question 6 */
	public String findMostRepeatedData(String[] arr){
		
		if(arr.length == 0){
			return "Please, use the real array";
		}
		if(arr.length == 1){
			return arr[0];
		}
		
		//I'd prefer to use HashMap to store word and count.
		
		HashMap<String, Integer> map = new HashMap<>(); //Word, Count 
		
		for(String word: arr){
			
			if(!map.containsKey(word)){
				map.put(word, 1);
			}
			else{
				map.put(word, map.get(word) + 1); //if it is redundant data, increase count of it.
			}
		}
		
		String mostWord = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
		return "Most Repeated Word is " + mostWord;
	}
	
	
	
	
}
