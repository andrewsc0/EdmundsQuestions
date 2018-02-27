import java.lang.StringBuilder;


public class Person {
	
	String name;
	String ID;
	
	public Person(String name) {
		
		this.name = name;
		
	}
	
	//creates an ID based on string input and 
	//howMany which is based on how many people of the same name 
	//are inside the IDlogger..
	//this method calls a private function 'multipleOfFive'
	//which creates the second part of the ID
	
	public String concat(String name, int howMany) {
		
		String idName;
		StringBuilder finalStr = new StringBuilder();
		if(name.length()<3) {
			
			idName = name;
			
		} else {
			
			idName = idName(name);
			
		}
		
		String num = multipleOfFive(howMany);
		ID = finalStr.append(idName).append(num).toString();
		return ID;
	}
	
	//creates the second part of the ID,
	//which is a multiple of 5.. 
	//returns the second part of the string for the final ID
	
	private String multipleOfFive(int num) {
		
		Integer by5 = num;
		Integer idNum = by5 * 5;
		StringBuilder str;
		
		if(by5 < 2) {
			
			str = new StringBuilder("00");
			str.append(idNum);
			
		}
		else if(by5>=2 && by5<20) {
			
			str = new StringBuilder("0");
			str.append(idNum);
			
		} else {
			
			str = new StringBuilder(idNum);
			
		}
		
			return str.toString();
		
	}
	
	public String idName(String inp) {
		
		inp = inp.substring(0, 3).toUpperCase();
		return inp;
		
	}
	
	public String getID() {
		
		return ID;
		
	}
	
	public String getName() {
		
		return name;
		
	}

}
