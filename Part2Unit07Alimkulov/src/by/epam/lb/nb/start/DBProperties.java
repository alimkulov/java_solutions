package by.epam.lb.nb.start;

import java.util.HashMap;
import java.util.Map;

public class DBProperties {

	private static DBProperties instance = null;
	private  final Map<String, String> properties=new HashMap<>();
	
	private DBProperties() {}
	
	public static DBProperties getInstance() {
		
		if(instance==null) {
			instance = new DBProperties();
			
		}
		
		return instance;
	}
	
	
}
