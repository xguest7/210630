package test;

public class Jsy implements Cal {

	@Override
	public int cal(int a, int b) {
		int result = 1;
		for(int i = 0; i<b; i++) {
			result *= a;
		}
		return result;
	}

}
