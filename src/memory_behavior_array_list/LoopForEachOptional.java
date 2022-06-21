package memory_behavior_array_list;

public class LoopForEachOptional {

	public static void main(String[] args) {
		
//		for (Tipy name : colection) {
//		<command 1>
//		<command 2>
//	}

		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("--------------------");
		for (String obj : vect) {
			System.out.println(obj);
		}
		
		
	}
}
