
public class Main {

	private static Assignments assignments = new Assignments();
	
	public Main(){
		
	}
	
	public static void main(String[] args) {
		
		String[] inputDataQuestionOne = {"aaaasd", "a", "aab", "aaabcd", "ef", "cssssssd", "fdz", "kf", "zc", "lklklklklklklklkl", "l"};
		System.out.println("Question 1 - Init");
		System.out.println(assignments.sortWords(inputDataQuestionOne));
		
		System.out.println("Question 2 - Init");
		System.out.println(assignments.findSubSqrtOfNumber(9));
		
		System.out.println("Question 6 - Init");
		String[] arr1 = {"apple","pie","apple","red","red","red"};
		System.out.println(assignments.findMostRepeatedData(arr1));
		
		String[] arr2 = {"c#","java","java","c#","c#","python","python","python","c#"};
		System.out.println(assignments.findMostRepeatedData(arr2));
		
		
		
	}

}
