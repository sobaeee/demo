
public class Variable6 {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		//start
		int a = i;
		i = j;
		j = a;

		//end
		/*
		 * i 값은 20, j값은 10
		 */
		System.out.println("i값은" + i);
		System.out.println("j값은" + j);
	}

}
