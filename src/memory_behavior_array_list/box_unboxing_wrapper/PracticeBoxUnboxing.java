package memory_behavior_array_list.box_unboxing_wrapper;

public class PracticeBoxUnboxing {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
		
	}
}
