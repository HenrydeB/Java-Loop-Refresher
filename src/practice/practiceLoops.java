package practice;

public class practiceLoops {

		public static void main(String args[]) {
			
			String str = "We have a large inventory of things in our warehouse falling in " 
			+ "the category:apperal and the slightly "
			+ "more in demand category:makeup along with the category:furniture and ...";
			
			printCategories(str);
		}
		
//		Extract all from the categories 
		
		public static void printCategories(String string) {
			int i = 0;
			
			while(true) {
				int found = string.indexOf("category:", i);
				if(found == -1) break;
				int start = found + 9;
				int end = string.indexOf(" ", start);
				System.out.println(string.substring(start, end));
				i = end+1;
						
			}
			
		}
}
