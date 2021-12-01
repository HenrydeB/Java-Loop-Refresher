package practice;

public class ForLoopsPractice {

	public static void main(String args[]) {
		
		String name = "debuchananne";
		
		for(int i = name.length()-1; i >= 0; i--) {
			char reconstructed = name.charAt(i);
//			System.out.println(reconstructed);
		}
		
		for(int j = 0; j <= 100; j+=2) {
			System.out.println(j);
		}
	}
}
