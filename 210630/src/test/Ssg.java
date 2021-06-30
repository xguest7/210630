package test;

public class Ssg implements Cal {

	@Override
	public int cal(int a, int b) {
		int result = 0;
		for(int i = 1; i<b; i++) {
			result += i+a;
		}
		return result;
	}

}
