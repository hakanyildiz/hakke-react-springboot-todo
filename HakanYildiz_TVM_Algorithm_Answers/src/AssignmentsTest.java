import static org.junit.Assert.*;

import org.junit.Test;

public class AssignmentsTest {

	@Test
	public void test() {
	//	fail("Not yet implemented");
	}

	
	@Test
	public void testSortWords(){
		String[] data = {"aaaasd", "a", "aab", "aaabcd", "ef", "cssssssd", "fdz", "kf", "zc", "lklklklklklklklkl", "l"};
		
		Assignments assignments = new Assignments();
		
		String result = assignments.sortWords(data);
		
		String excepted = "Question 1 Output --> aaaasd,aaabcd,aab,a,lklklklklklklklkl,cssssssd,fdz,ef,kf,zc,l";
		assertEquals(excepted, result);
		
	}
}
