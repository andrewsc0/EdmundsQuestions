import java.util.*;

public class IDReader {
	
	Map logger;
	ArrayList personList;
	Person[] arr;
	
	//in this case, the String maps to a list of Person objects which have the same name.
	//if there is no need to keep a record of the IDs, then an Integer would do
	
	public IDReader() {
		
		personList = new ArrayList<Person>();
		logger = new HashMap<String, ArrayList<Person>>();
		
	}
	
	public String enterName(String name) {
		
		Person pers = new Person(name);
		String idName = pers.idName(name);
		if(logger.containsKey(idName)) {
			
			personList = (ArrayList) logger.get(idName);
			pers.concat(name, personList.size()+1);
			((ArrayList) logger.get(idName)).add(pers);
			
		} else {
			
			logger.put(idName, new ArrayList<Person>());
			pers.concat(name, 1);
			((ArrayList) logger.get(idName)).add(pers);
			
		}
		
		return pers.getID();
		
	}

}
