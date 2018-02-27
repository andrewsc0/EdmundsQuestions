
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDReader read = new IDReader();
		String str = read.enterName("Jen");
		String str2 = read.enterName("Jen");
		String str3 = read.enterName("Tom");
		String str4 = read.enterName("Vito");
		String str5 = read.enterName("Jennifer");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}

}
